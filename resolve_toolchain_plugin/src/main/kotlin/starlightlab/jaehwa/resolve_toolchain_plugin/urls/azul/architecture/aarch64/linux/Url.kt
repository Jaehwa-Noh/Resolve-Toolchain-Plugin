package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.aarch64.linux

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

internal val azulLinuxAarch64UrlMap = buildMap {
    val linuxAarch64TarGz = "linux_aarch64.tar.gz"

    // note: Azul - Linux - Aarch64
    put(
        "$AZUL-$LINUX-${Architecture.AARCH64}-$JDK_25",
        "$JDK25URL-$linuxAarch64TarGz"
    )

    put(
        "$AZUL-$LINUX-${Architecture.AARCH64}-$JDK_21",
        "$JDK21URL-$linuxAarch64TarGz"
    )

    put(
        "$AZUL-$LINUX-${Architecture.AARCH64}-$JDK_17",
        "$JDK17URL-$linuxAarch64TarGz"
    )

    put(
        "$AZUL-$LINUX-${Architecture.AARCH64}-$JDK_11",
        "$JDK11URL-$linuxAarch64TarGz"
    )

    put(
        "$AZUL-$LINUX-${Architecture.AARCH64}-$JDK_8",
        "$JDK8URL-$linuxAarch64TarGz"
    )
}
