import okhttp3.internal.toHexString
import java.io.BufferedWriter
import java.util.Locale

plugins {
//    id("root.publication")
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.kotlinx.serialization) apply false

    alias(libs.plugins.maven.publish)
}

val done = false

task("parseZhongGuoSeFromFile") {
    if (done) return@task
    println("parse start...")
    val chinese = "石板灰".isChinese()
    println("chinese=$chinese")
    val sourcePath = project.rootDir.absolutePath + "/colors/Colors.txt"
//    val destPath = project.rootDir.absolutePath + "/colors/ZhongGuoSe.kt"
    val destPath =
        project.rootDir.absolutePath + "/zhongguohong/src/commonMain/kotlin/com/zeeeeej/zhongguohong/color/ZhongGuoSe.kt"
    println("解析文本路径：$sourcePath")
    println("写入文本路径：$destPath")
    val file = File(sourcePath)
    val dest = File(destPath)
    if (dest.exists()) {
        dest.delete()
    }
    dest.createNewFile()
    val bufferedWriter = dest.bufferedWriter()
    println("#### 开始解析 ####")
    val colors = mutableListOf<ZhongGuoColor>()
    file.bufferedReader().use { reader ->
        var name: String? = null
        reader.forEachLine { line ->

            val result = parseToColor(line)
            println("->解析：$line 结果:$result")
            when (result) {
                is ParsedResult.Named -> {
                    println("   |解析名称：${result.name}")
                    name = result.name
                }

                is ParsedResult.Hexed -> {
                    val tmp = name

                    if (tmp != null) {
                        println("   |名称在 创建颜色 $result")
                        val color = ZhongGuoColor(
                            name = tmp,
                            value = result.value,
                            pinyin = result.pinyin
                        )
                        colors.add(
                            color
                        )
//                        bufferedWriter.write(color.toString() + "\n")

                        name = null
                    } else {
                        println("|名称无，构建失败")
                    }
                }

                ParsedResult.Error -> {
                    println("   parse error")
                }

//                else ->{}
            }
        }
    }

    println("#### 解析完毕，一共${colors.size}个 ####")
    if (colors.isNotEmpty()) {
        println("开始写入数据")
        colors.writeZhongGuoSe(bufferedWriter)
        println("写入完毕")
    }
}

data class ZhongGuoColor(val name: String = "", val value: Long = 0, val pinyin: String = "")
sealed class ParsedResult {
    class Named(val name: String) : ParsedResult()
    class Hexed(val pinyin: String, val value: Long) : ParsedResult()
    object Error : ParsedResult()
}

fun parseToColor(line: String): ParsedResult {
    if (line.isBlank()) return ParsedResult.Error
    if (line.contains(" ")) return ParsedResult.Error
    if (line.isChinese()) {
        return ParsedResult.Named(line)
    } else {
        val (pinyin, value) = line.parsePinYinAndValue() ?: return ParsedResult.Error
        return ParsedResult.Hexed(pinyin = pinyin, value = value)
    }

}

fun String.parsePinYinAndValue(): Pair<String, Long>? {
    try {
        val hex = this.takeLast(6)
        val pinyin = this.take(this.length - 6)
        return pinyin to "FF$hex".toLong(16)
    } catch (e: Exception) {
        println("   [error]parsePinYinAndValue ${e.localizedMessage}")
        return null
    }
}

fun String.isChinese(): Boolean {
    fun isChinese(c: Char): Boolean {
        return c in '\u4e00'..'\u9fff'
    }
    return this.any(::isChinese)
}

fun List<ZhongGuoColor>.writeZhongGuoSe(writer: BufferedWriter) {
    try {
        writer.write(
            """
            |/*
            | * 中国色（一共${this.size}种颜色）
            | */
            |enum class 中国色 (val text : String,val pinyin : String,val value : Long) {
            |
        """.trimMargin()
        )

        this.forEach {
            it.writeZhongGuoSe(writer)
        }

        writeExt(writer)

        writeTypealias(writer, this)

    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        writer.flush()
    }
}

fun List<ZhongGuoColor>.write(writer: BufferedWriter) {
    try {
        this.forEach {
            it.write(writer, this)
        }
        writer.write(
            """
            | val ZhongGuoSe :List<Long> = listOf(
            | ${this.joinToString(",") { it.varName }}
            | )
        """
                .trimMargin()
        )
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        writer.flush()
    }

}

val ZhongGuoColor.varName: String
    //    get()  ="`${this.pinyin.lowercase(Locale.getDefault())}${this.name}`"
    get() = "`${this.name}`"

fun ZhongGuoColor.write(writer: BufferedWriter, all: List<ZhongGuoColor>) {
    val text = """
        |/*
        | * 《中国色》 
        | * ${this.name}
        | */
        | val $varName : Long = 0x${this.value.toHexString()}
        |
    """.trimMargin()
    writer.write(text)

}

infix fun List<ZhongGuoColor>.hasSamePinYin(color: ZhongGuoColor): Boolean {
    return this.any {
        it.pinyin == color.pinyin
    }
}

fun ZhongGuoColor.writeZhongGuoSe(writer: BufferedWriter) {
    val textStr = this.name
    val pinyinStr = this.pinyin.lowercase(Locale.getDefault())
    val valueStr = "0x${this.value.toHexString()}"


    val line = """
        |   /* ${textStr}(${pinyinStr}) */
        |   ${textStr}("$textStr","$pinyinStr",$valueStr),
        |
    """.trimMargin()
    writer.write(line)

}


fun writeExt(writer: BufferedWriter) {
    writer.write(
        """
            |;
            |}
            |
            |
            |val zhongGuoSeList by lazy {
            |    中国色.entries.toList()
            |}
            |
            |typealias ZhongGuoSe = 中国色
            |
            |fun randomZhongGuoSe() = zhongGuoSeList.random()
            |
        """.trimMargin()
    )
}

fun writeTypealias(writer: BufferedWriter, list: List<ZhongGuoColor>) {

//    fun String.hasMore() = list.filter {
//        it.pinyin == this
//    }.size>1
//
//    list.forEach {
//        val pinyin = it.pinyin
//        val name = it.name
//        val typealiasName = if (pinyin.hasMore()) "${pinyin}$name" else pinyin
//        writer.write(
//            """
//            |typealias $typealiasName = 中国色.$name
//        """.trimMargin()
//        )
//        writer.write("\n")
//    }

}
