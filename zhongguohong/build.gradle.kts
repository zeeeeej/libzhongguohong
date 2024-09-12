import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
//    id("module.publication")
//    `maven-publish`
    alias(libs.plugins.maven.publish)
}

group = "io.github.zeeeeej"
version = "0.0.3"


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
    linuxX64()

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs()
    js()

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
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

    coordinates("io.github.zeeeeej", "zhongguohong", "0.0.3")

    pom {
        name.set("zhongguohong")
        description.set("zhongguohong")
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
