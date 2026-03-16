plugins {
    `kotlin-dsl`
    alias(libs.plugins.jetbrains.kotlin.jvm)
    alias(libs.plugins.gradle.plugin.publish)
}

kotlin {
    compilerOptions {
        jvmToolchain(17)
    }
}

group = "io.github.jaehwa-noh"
version = "1.0.0-alpha01"

gradlePlugin {
    vcsUrl = "https://github.com/Jaehwa-Noh/Resolve-Toolchain-Plugin"
    website = "https://github.com/Jaehwa-Noh/Resolve-Toolchain-Plugin"

    plugins {
        create("myToolchainPlugin") {
            id = "io.github.jaehwa-noh.resolve-toolchain-plugin"
            implementationClass = "starlightlab.jaehwa.resolve_toolchain_plugin.ResolveToolchainPlugin"
            displayName = "Resolve Toolchain Plugin"
            description = "For Java toolchain auto-provisioning plugin. JDK will be downlaoded from the Official download URL"
            tags = listOf("toolchains", "auto-provision")
        }
    }

    plugins {
        create("myToolchainPluginPresetting") {
            id = "io.github.jaehwa-noh.resolve-toolchain-plugin-presetting"
            implementationClass = "starlightlab.jaehwa.resolve_toolchain_plugin.ResolveToolchainPluginPresetting"
            displayName = "Resolve Toolchain Plugin Presetting"
            description = "For Java toolchain auto-provisioning plugin and presetting. JDK will be downlaoded from the Official download URL"
            tags = listOf("toolchains", "auto-provision")
        }
    }
}
