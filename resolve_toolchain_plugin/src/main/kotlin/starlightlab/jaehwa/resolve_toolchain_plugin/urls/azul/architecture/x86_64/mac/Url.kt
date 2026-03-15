package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86_64.mac


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

internal val azulMacX86_64UrlMap = buildMap {
    val macOsX64TarGz = "macosx_x64.tar.gz"

    // note: Azul - Mac - X86_64
    put(
        "$AZUL-$MAC-${Architecture.X86_64}-$JDK_25",
        "$JDK25URL-$macOsX64TarGz"
    )

    put(
        "$AZUL-$MAC-${Architecture.X86_64}-$JDK_21",
        "$JDK21URL-$macOsX64TarGz"
    )

    put(
        "$AZUL-$MAC-${Architecture.X86_64}-$JDK_17",
        "$JDK17URL-$macOsX64TarGz"
    )

    put(
        "$AZUL-$MAC-${Architecture.X86_64}-$JDK_11",
        "$JDK11URL-$macOsX64TarGz"
    )

    put(
        "$AZUL-$MAC-${Architecture.X86_64}-$JDK_8",
        "$JDK8URL-$macOsX64TarGz"
    )
}
