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
    plugins {
        create("myToolchainPlugin") {
            id = "io.github.jaehwa-noh.resolve-toolchain-plugin"
            implementationClass = "starlightlab.jaehwa.resolve_toolchain_plugin.ResolveToolchainPlugin"
        }
    }

    plugins {
        create("myToolchainPluginPresetting") {
            id = "io.github.jaehwa-noh.resolve-toolchain-plugin-presetting"
            implementationClass = "starlightlab.jaehwa.resolve_toolchain_plugin.ResolveToolchainPluginPresetting"
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("myToolchainPlugin") {
            from(components["java"])
        }
    }
}
