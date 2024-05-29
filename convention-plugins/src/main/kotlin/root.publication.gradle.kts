//plugins {
//    id("io.github.gradle-nexus.publish-plugin")
//        id ("maven-publish")
//}
//
//allprojects {
//    group = "io.github.zeeeeej"
//    version = "0.0.1"
//}
//
//nexusPublishing {
//    // Configure maven central repository
//    // https://github.com/gradle-nexus/publish-plugin#publishing-to-maven-central-via-sonatype-ossrh
//    repositories {
////        sonatype {  //only for users registered in Sonatype after 24 Feb 2021
////            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
////            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
////            username = "LipWlRR5"
////            password = "83Cha+BLDVzgKujph4hJGXidsb5yP7eO5sZtBHeRPoHW"
////        }
//
//        create("myNexus") {
////            nexusUrl.set(uri("https://github.com/zeeeeej/libzhongguohong"))
////            snapshotRepositoryUrl.set(uri("https://github.com/zeeeeej/libzhongguohong"))
//            username.set("LipWlRR5") // defaults to project.properties["myNexusUsername"]
//            password.set("83Cha+BLDVzgKujph4hJGXidsb5yP7eO5sZtBHeRPoHW") // defaults to project.properties["myNexusPassword"]
//        }
//
//
//    }
//}
