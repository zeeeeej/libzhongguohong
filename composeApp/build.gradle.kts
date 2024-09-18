import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        moduleName = "composeApp"
        browser {
            commonWebpackConfig {
                outputFileName = "composeApp.js"
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(project.projectDir.path)
                    }
                }
            }
        }
        binaries.executable()
    }

    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    jvm("desktop")

    listOf(
        iosX64("iosMain"),
        iosArm64("iosMain1"),
        iosSimulatorArm64("iosMain2")
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }

    sourceSets {
        val desktopMain by getting

        androidMain.dependencies {
            implementation(compose.preview)
            implementation(libs.androidx.activity.compose)

            implementation(libs.kotlinx.coroutines.core)
            implementation(libs.kotlinx.coroutines.android)

        }
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources) // SEE https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-images-resources.html
            implementation(compose.components.uiToolingPreview)
            implementation(projects.shared)
//            implementation("io.github.zeeeeej:zhongguohong:0.0.3")
            implementation(project(":zhongguohong"))
            implementation(project(":zhongguohong-compose"))


        }
        desktopMain.dependencies {
            implementation(compose.desktop.currentOs)

            implementation(libs.kotlinx.coroutines.core)
            implementation(libs.kotlinx.coroutines.swing)

        }

            iosMain.dependencies {
                implementation(libs.kotlinx.coroutines.core)

            }


//        val iosMain by getting {
//            dependencies {
//                implementation(libs.kotlinx.coroutines.core)
////                implementation("io.github.zeeeeej:zhongguohong-ios:0.0.2")
//            }
//        }


//        val iosArm64Main by getting {
//            dependencies {
//                implementation(libs.kotlinx.coroutines.core)
//                implementation("io.github.zeeeeej:zhongguohong-iosarm64:0.0.2")
//            }
//        }
//
//        val iosSimulatorArm64Main by getting{
//            dependsOn(iosMain.get())
//            dependencies {
//                implementation("io.github.zeeeeej:zhongguohong-iossimulatorarm64:0.0.2")
//            }
//        }


//        wasmJsMain.dependencies {
//
//            implementation(libs.kotlinx.coroutines.core)
//        }
    }
}

android {
    namespace = "com.yunext.kotlin.kmp.sample"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    defaultConfig {
        applicationId = "com.yunext.kotlin.kmp.sample"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
    dependencies {
        debugImplementation(compose.uiTooling)
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.yunext.kotlin.kmp.sample"
            packageVersion = "1.0.0"
        }
    }
}

//compose.resources{
//    publicResClass = true
//    packageOfResClass = "com.yunext.kotlin.kmp.sample"
//    generateResClass = always
//}
