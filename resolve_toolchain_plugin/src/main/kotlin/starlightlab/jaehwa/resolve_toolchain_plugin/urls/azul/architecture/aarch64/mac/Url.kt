package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.aarch64.mac


import org.gradle.platform.Architecture
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.AZUL
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_11
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_17
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_21
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_25
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_8
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.MAC
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK11URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK17URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK21URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK25URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK8URL

internal val azulMacAarch64UrlMap = buildMap {
    val macOsAarch64TarGz = "macosx_aarch64.tar.gz"

    // note: Azul - Mac - Aarch64
    put(
        "$AZUL-$MAC-${Architecture.AARCH64}-$JDK_25",
        "$JDK25URL-$macOsAarch64TarGz"
    )

    put(
        "$AZUL-$MAC-${Architecture.AARCH64}-$JDK_21",
        "$JDK21URL-$macOsAarch64TarGz"
    )

    put(
        "$AZUL-$MAC-${Architecture.AARCH64}-$JDK_17",
        "$JDK17URL-$macOsAarch64TarGz"
    )

    put(
        "$AZUL-$MAC-${Architecture.AARCH64}-$JDK_11",
        "$JDK11URL-$macOsAarch64TarGz"
    )

    put(
        "$AZUL-$MAC-${Architecture.AARCH64}-$JDK_8",
        "$JDK8URL-$macOsAarch64TarGz"
    )
}
