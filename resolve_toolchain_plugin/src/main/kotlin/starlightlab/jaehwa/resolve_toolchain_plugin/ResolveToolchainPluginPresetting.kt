package starlightlab.jaehwa.resolve_toolchain_plugin

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.kotlin.dsl.jvm

abstract class ResolveToolchainPluginPresetting : Plugin<Settings> {

    override fun apply(settings: Settings) {

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
