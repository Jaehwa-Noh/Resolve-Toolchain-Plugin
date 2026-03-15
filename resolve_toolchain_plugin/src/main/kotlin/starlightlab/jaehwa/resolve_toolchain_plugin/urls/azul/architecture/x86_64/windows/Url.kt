package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86_64.windows

import org.gradle.platform.Architecture
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.AZUL
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_11
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_17
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_21
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_25
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_8
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.WINDOWS
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK11URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK17URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK21URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK25URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK8URL

internal val azulWindowsX86_64UrlMap = buildMap {
    val winX64Zip = "win_x64.zip"

    // note: Azul - Windows - X86_64
    put(
        "$AZUL-$WINDOWS-${Architecture.X86_64}-$JDK_25",
        "$JDK25URL-$winX64Zip"
    )

    put(
        "$AZUL-$WINDOWS-${Architecture.X86_64}-$JDK_21",
        "$JDK21URL-$winX64Zip"
    )

    put(
        "$AZUL-$WINDOWS-${Architecture.X86_64}-$JDK_17",
        "$JDK17URL-$winX64Zip"
    )

    put(
        "$AZUL-$WINDOWS-${Architecture.X86_64}-$JDK_11",
        "$JDK11URL-$winX64Zip"
    )

    put(
        "$AZUL-$WINDOWS-${Architecture.X86_64}-$JDK_8",
        "$JDK8URL-$winX64Zip"
    )
}
