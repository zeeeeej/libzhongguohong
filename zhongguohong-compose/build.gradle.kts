import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
//    id("module.publication")
//    `maven-publish`
    alias(libs.plugins.maven.publish)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
}

val appVersion = "1.0.2"

group = "io.github.zeeeeej"
version = appVersion


kotlin {
    targetHierarchy.default()
    jvm()
    androidTarget {
        publishLibraryVariants("release")
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()
//    linuxX64()

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        moduleName = "composeApp"
        browser {
            val projectDirPath = project.projectDir.path
            commonWebpackConfig {
                outputFileName = "composeApp.js"
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(projectDirPath)
                    }
                }
            }
        }
        binaries.executable()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
//                implementation(compose.runtime)
//                implementation(compose.foundation)
                implementation(compose.material)
//                implementation(compose.ui)
                implementation(project(":zhongguohong"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
    }
}

android {
    namespace = "org.jetbrains.kotlinx.multiplatform.library.template"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}


mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL, automaticRelease = true)
    signAllPublications()

    coordinates("io.github.zeeeeej", "zhongguohong-compose", appVersion)

    pom {
        name.set("zhongguohong-compose")
        description.set("zhongguohong-compose")
        inceptionYear.set("2024")
        url.set("https://github.com/zeeeeej/libzhongguohong")
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        developers {
            developer {
                id.set("zeeeeej.xpl")
                name.set("zeeeeej")
                url.set("https://github.com/zeeeeej/libzhongguohong")
            }
        }

        scm {
            url.set("https://github.com/zeeeeej/libzhongguohong")
            connection.set("scm:git:git://gitlab.com/zeeeeej/libzhongguohong.git")
            developerConnection.set("scm:git:ssh://git@gitlab.com:zeeeeej/libzhongguohong.git")
        }
    }
}
