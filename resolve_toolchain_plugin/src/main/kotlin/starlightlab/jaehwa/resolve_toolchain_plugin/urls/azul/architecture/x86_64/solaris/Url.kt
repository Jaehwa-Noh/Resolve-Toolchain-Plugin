package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86_64.solaris

import org.gradle.platform.Architecture
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.AZUL
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_11
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.JDK_8
import starlightlab.jaehwa.resolve_toolchain_plugin.extensions.SOLARIS
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK11URL
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.JDK8URL

internal val azulSolariseX86_64UrlMap = buildMap {
    val solarisX64Zip = "solaris_x64.zip"

    // note: Azul - Solaris - X86_64
    put(
        "$AZUL-$SOLARIS-${Architecture.X86_64}-$JDK_11",
        "$JDK11URL-$solarisX64Zip"
    )

    put(
        "$AZUL-$SOLARIS-${Architecture.X86_64}-$JDK_8",
        "$JDK8URL-$solarisX64Zip"
    )
}
