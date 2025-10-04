plugins {
    java
    id("io.freefair.lombok")
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.18"
}

dependencies {
    compileOnly(project(":modules:API"))
    compileOnly(project(":modules:Skills"))
    compileOnly("com.mojang:brigadier:1.3.10")
    compileOnly("com.mojang:datafixerupper:8.0.16")
    compileOnly("com.mojang:javabridge:1.2.24")
    compileOnly("com.mojang:authlib:6.0.58")

    paperweight.paperDevBundle("1.21.8-R0.1-SNAPSHOT")
}

description = "MyPet-NMS"
