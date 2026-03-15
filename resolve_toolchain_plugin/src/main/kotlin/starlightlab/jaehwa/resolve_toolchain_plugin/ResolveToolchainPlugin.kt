package starlightlab.jaehwa.resolve_toolchain_plugin

import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.jvm.toolchain.JavaToolchainResolverRegistry
import org.gradle.util.GradleVersion
import javax.inject.Inject


abstract class ResolveToolchainPlugin : Plugin<Settings> {

    @Inject
    protected abstract fun getToolchainResolverRegistry(): JavaToolchainResolverRegistry

    override fun apply(settings: Settings) {
        val minGradle = GradleVersion.version("7.6")
        if (GradleVersion.current() < minGradle) {
            throw GradleException("${minGradle.version} and above requires to use toolchain resolver plugin")
        }

        with(settings) {
            plugins.apply("jvm-toolchain-management")
        }

        val registry = getToolchainResolverRegistry()
        registry.register(JavaToolchainResolverImplementation::class.java)
    }
}
