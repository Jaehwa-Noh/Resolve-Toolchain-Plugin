package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86.windows

import org.gradle.platform.Architecture
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.AZUL
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_11
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_17
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_8
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.WINDOWS
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK11URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK17URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK8URL

internal val azulWindowsX86UrlMap = buildMap {
    val winI686Zip = "win_i686.zip"

    // note: Azul - Windows - X86

    put(
        "$AZUL-$WINDOWS-${Architecture.X86}-$JDK_17",
        "$JDK17URL-$winI686Zip"
    )

    put(
        "$AZUL-$WINDOWS-${Architecture.X86}-$JDK_11",
        "$JDK11URL-$winI686Zip"
    )

    put(
        "$AZUL-$WINDOWS-${Architecture.X86}-$JDK_8",
        "$JDK8URL-$winI686Zip"
    )
}
