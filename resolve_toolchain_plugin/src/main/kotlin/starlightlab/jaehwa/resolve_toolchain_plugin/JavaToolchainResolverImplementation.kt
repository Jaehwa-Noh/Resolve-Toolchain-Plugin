package starlightlab.jaehwa.resolve_toolchain_plugin

import org.gradle.jvm.toolchain.JavaToolchainDownload
import org.gradle.jvm.toolchain.JavaToolchainRequest
import org.gradle.jvm.toolchain.JavaToolchainResolver
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.getUrl
import java.net.URI
import java.util.Optional

abstract class JavaToolchainResolverImplementation : JavaToolchainResolver {

    override fun resolve(request: JavaToolchainRequest): Optional<JavaToolchainDownload> {

        val url = request.getUrl() ?: return Optional.ofNullable(null)

        return Optional.ofNullable(
            JavaToolchainDownload.fromUri(
                URI(url)
            )
        )
    }
}
