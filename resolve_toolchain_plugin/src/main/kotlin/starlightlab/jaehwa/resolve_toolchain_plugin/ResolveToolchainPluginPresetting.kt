package starlightlab.jaehwa.resolve_toolchain_plugin

import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.kotlin.dsl.jvm
import org.gradle.util.GradleVersion

abstract class ResolveToolchainPluginPresetting : Plugin<Settings> {

    override fun apply(settings: Settings) {
        val minGradle = GradleVersion.version("7.6")
        if (GradleVersion.current() < minGradle) {
            throw GradleException("${minGradle.version} and above requires to use toolchain resolver plugin")
        }

        with(settings) {
            plugins.apply("io.github.jaehwa-noh.resolve-toolchain-plugin")

            toolchainManagement {
                this.jvm {
                    javaRepositories {
                        this.repository("resolveToolchainPlugin") {
                            this.resolverClass.set(JavaToolchainResolverImplementation::class.java)
                        }
                    }
                }
            }
        }
    }
}
