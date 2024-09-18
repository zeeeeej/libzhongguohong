import androidx.compose.ui.graphics.Color

val 中国色.color: Color
    get() = Color(this.value)

@OptIn(ExperimentalStdlibApi::class)
val 中国色.hex: String
    get() = this.value.toInt().toHexString().uppercase()