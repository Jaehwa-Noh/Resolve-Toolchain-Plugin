package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.aarch64.solaris

import org.gradle.platform.Architecture
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.AZUL
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_11
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_8
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.SOLARIS
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK11URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK8URL

internal val azulSolarisAarch64UrlMap = buildMap {
    val solarisSparcv9Zip = "solaris_sparcv9.zip"

    // note: Azul - Solaris - SPARC64
    put(
        "$AZUL-$SOLARIS-${Architecture.AARCH64}-$JDK_11",
        "$JDK11URL-$solarisSparcv9Zip"
    )

    put(
        "$AZUL-$SOLARIS-${Architecture.AARCH64}-$JDK_8",
        "$JDK8URL-$solarisSparcv9Zip"
    )
}
