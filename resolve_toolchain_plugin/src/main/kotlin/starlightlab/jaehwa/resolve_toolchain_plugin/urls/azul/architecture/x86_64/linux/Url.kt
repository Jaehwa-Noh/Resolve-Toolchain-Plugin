package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86_64.linux

import org.gradle.platform.Architecture
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.AZUL
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_11
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_17
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_21
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_25
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_8
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.LINUX
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK11URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK17URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK21URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK25URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK8URL

internal val azulLinuxX86_64UrlMap = buildMap {
    val linuxX64TarGz = "linux_x64.tar.gz"

    // note: Azul - Linux - X86_64
    put(
        "$AZUL-$LINUX-${Architecture.X86_64}-$JDK_25",
        "$JDK25URL-$linuxX64TarGz"
    )

    put(
        "$AZUL-$LINUX-${Architecture.X86_64}-$JDK_21",
        "$JDK21URL-$linuxX64TarGz"
    )

    put(
        "$AZUL-$LINUX-${Architecture.X86_64}-$JDK_17",
        "$JDK17URL-$linuxX64TarGz"
    )

    put(
        "$AZUL-$LINUX-${Architecture.X86_64}-$JDK_11",
        "$JDK11URL-$linuxX64TarGz"
    )

    put(
        "$AZUL-$LINUX-${Architecture.X86_64}-$JDK_8",
        "$JDK8URL-$linuxX64TarGz"
    )
}
