import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.`maven-publish`

plugins {
    `maven-publish`
    signing
}

publishing {
    repositories {
        maven {
            name = "zhongguohong"
            url = uri("https://github.com/zeeeeej/libzhongguohong")
            // username and password (a personal Github access token) should be specified as
            // `githubPackagesUsername` and `githubPackagesPassword` Gradle properties or alternatively
            // as `ORG_GRADLE_PROJECT_githubPackagesUsername` and `ORG_GRADLE_PROJECT_githubPackagesPassword`
            // environment variables
            credentials(PasswordCredentials::class)
        }
    }
}

publishing {
    publications {
        matching {
            return@matching it.name in listOf("iosArm64", "iosX64", "kotlinMultiplatform")
        }.all {
            tasks.withType<AbstractPublishToMaven>()
                .matching { it.publication == this@all }
                .configureEach { onlyIf { findProperty("isMainHost") == "true" } }
        }
    }
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/SergeiMikhailovskii/kmp-app-review")
            credentials {
                username = System.getenv("GITHUB_USER")
                password = System.getenv("GITHUB_API_KEY")
            }
        }
    }
}

//mavenPublishing {
//    coordinates("com.zeeeeej.zhongguohong", "zhongguohong", "0.0.1")
//
//    // the following is optional
//
//    pom {
//        name.set("My Library")
//        description.set("A description of what my library does.")
//        inceptionYear.set("2020")
//        url.set("https://github.com/username/mylibrary/")
//        licenses {
//            license {
//                name.set("The Apache License, Version 2.0")
//                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
//                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
//            }
//        }
//        developers {
//            developer {
//                id.set("username")
//                name.set("User Name")
//                url.set("https://github.com/username/")
//            }
//        }
//        scm {
//            url.set("https://github.com/username/mylibrary/")
//            connection.set("scm:git:git://github.com/username/mylibrary.git")
//            developerConnection.set("scm:git:ssh://git@github.com/username/mylibrary.git")
//        }
//    }
//}

//
//mavenPublishing {
//    coordinates("com.example.mylibrary", "mylibrary-runtime", "1.0.3-SNAPSHOT")
//
//    pom {
//        name.set("My Library")
//        description.set("A description of what my library does.")
//        inceptionYear.set("2020")
//        url.set("https://github.com/username/mylibrary/")
//        licenses {
//            license {
//                name.set("The Apache License, Version 2.0")
//                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
//                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
//            }
//        }
//        developers {
//            developer {
//                id.set("username")
//                name.set("User Name")
//                url.set("https://github.com/username/")
//            }
//        }
//        scm {
//            url.set("https://github.com/username/mylibrary/")
//            connection.set("scm:git:git://github.com/username/mylibrary.git")
//            developerConnection.set("scm:git:ssh://git@github.com/username/mylibrary.git")
//        }
//    }
//}


//        mavenPublishing {
////            publishToMavenCentral(SonatypeHost.DEFAULT)
//            // or when publishing to https://s01.oss.sonatype.org
////            publishToMavenCentral(SonatypeHost.S01)
//            // or when publishing to https://central.sonatype.com/
//            publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
//
//            signAllPublications()
//        }
//
//publishing {
//    // Configure all publications
//    publications.withType<MavenPublication> {
//        // Stub javadoc.jar artifact
//        artifact(tasks.register("${name}JavadocJar", Jar::class) {
//            archiveClassifier.set("javadoc")
//            archiveAppendix.set(this@withType.name)
//        })
//
//        // Provide artifacts information required by Maven Central
//        pom {
//            name.set("zhongguohong-pom")
//            description.set(" Zhong Guo Hong")
//            url.set("https://github.com/zeeeeej/libzhongguohong")
//
//            licenses {
//                license {
//                    name.set("MIT")
//                    url.set("https://opensource.org/licenses/MIT")
//                }
//            }
//            developers {
//                developer {
//                    id.set("zeeeeejxpl")
//                    name.set("zeeeeej")
//                    organization.set("zeeeeejxpl")
//                    organizationUrl.set("https://github.com/zeeeeej")
//                }
//            }
//            scm {
//                url.set("https://github.com/zeeeeej/libzhongguohong/")
//
////                connection .set("scm:git:git://zeeeeej.com/libzhongguohong.git")
////                developerConnection .set( "scm:git:ssh://zeeeeej.com/libzhongguohong.git")
//            }
//        }
//    }
//}
//
//signing {
//    if (project.hasProperty("signing.gnupg.keyName")) {
//        useGpgCmd()
//        sign(publishing.publications)
//    }
//}
