package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.aarch64.windows

import org.gradle.platform.Architecture
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.AZUL
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_17
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_21
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_25
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.WINDOWS
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK17URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK21URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK25URL

internal val azulWindowsAarch64UrlMap = buildMap {
    val winAarch64Zip = "win_aarch64.zip"

    // note: Azul - Windows - Aarch64
    put(
        "$AZUL-$WINDOWS-${Architecture.AARCH64}-$JDK_25",
        "$JDK25URL-$winAarch64Zip"
    )

    put(
        "$AZUL-$WINDOWS-${Architecture.AARCH64}-$JDK_21",
        "$JDK21URL-$winAarch64Zip"
    )

    put(
        "$AZUL-$WINDOWS-${Architecture.AARCH64}-$JDK_17",
        "$JDK17URL-$winAarch64Zip"
    )
}
