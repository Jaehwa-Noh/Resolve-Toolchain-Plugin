package starlightlab.jaehwa.resolve_toolchain_plugin

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.jvm.toolchain.JavaToolchainResolverRegistry
import javax.inject.Inject


abstract class ResolveToolchainPlugin : Plugin<Settings> {

    @Inject
    protected abstract fun getToolchainResolverRegistry(): JavaToolchainResolverRegistry

    override fun apply(settings: Settings) {
        with(settings) {
            plugins.apply("jvm-toolchain-management")
        }

        val registry = getToolchainResolverRegistry()
        registry.register(JavaToolchainResolverImplementation::class.java)
    }
}
