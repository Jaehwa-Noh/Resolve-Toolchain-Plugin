package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86.linux

import org.gradle.platform.Architecture
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.AZUL
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_11
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_17
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_8
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.LINUX
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK11URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK17URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK8URL

internal val azulLinuxX86UrlMap = buildMap {
    val linuxI686TarGz = "linux_i686.tar.gz"

    // note: Azul - Linux - X86
    put(
        "$AZUL-$LINUX-${Architecture.X86}-$JDK_17",
        "$JDK17URL-$linuxI686TarGz"
    )

    put(
        "$AZUL-$LINUX-${Architecture.X86}-$JDK_11",
        "$JDK11URL-$linuxI686TarGz"
    )

    put(
        "$AZUL-$LINUX-${Architecture.X86}-$JDK_8",
        "$JDK8URL-$linuxI686TarGz"
    )
}
