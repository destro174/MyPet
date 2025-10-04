plugins {
    java
    id("io.freefair.lombok") version "9.0.0"
}

allprojects {
    apply(plugin = "java")

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(21)
        }
    }

    dependencies {
        compileOnly("org.fusesource.jansi:jansi:1.18")
        compileOnly("io.papermc.paper:paper-api:1.21.9-R0.1-SNAPSHOT")
        compileOnly("de.keyle:knbt:0.0.5")
        compileOnly("at.blvckbytes:RawMessage:0.2")
        compileOnly("de.keyle:mypet-skilltree-creator:3.0-SNAPSHOT")
        compileOnly("org.nanohttpd:nanohttpd:2.3.2-SNAPSHOT")
        compileOnly("org.nanohttpd:nanohttpd-websocket:2.3.2-SNAPSHOT")
        compileOnly("com.google.code.gson:gson:2.8.9")
    }

    repositories {
        mavenCentral()
        maven {
            name = "mypet-repo"
            url = uri("https://repo.mypet-plugin.de/")
        }
        maven {
            name = "oss-sonartype-repo"
            url = uri("https://oss.sonatype.org/content/groups/public/")
        }
        maven {
            name = "github"
            url = uri("https://maven.pkg.github.com/MyPetORG/*")
        }
        maven {
            name = "dmulloy2-repo"
            url = uri("https://repo.dmulloy2.net/nexus/repository/public/")
        }
        maven {
            name = "enginehub-repo"
            url = uri("https://maven.enginehub.org/repo/")
        }
        maven {
            name = "Paper-repo"
            url = uri("https://repo.papermc.io/repository/maven-public/")
        }
        maven {
            name = "md5-repo"
            url = uri("https://repo.md-5.net/content/repositories/public")
        }
        maven {
            name = "jitpack.io"
            url = uri("https://jitpack.io")
        }
        maven {
            name = "songoda"
            url = uri("https://repo.songoda.com/repository/minecraft-plugins/")
        }
        mavenLocal()
    }
}