package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul

import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.aarch64.azulAarch64UrlMap
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86.azulX86UrlMap
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86_64.azulX86_64UrlMap

internal const val JDK25URL = "https://cdn.azul.com/zulu/bin/zulu25.32.21-ca-jdk25.0.2"
internal const val JDK21URL = "https://cdn.azul.com/zulu/bin/zulu21.48.17-ca-jdk21.0.10"
internal const val JDK17URL = "https://cdn.azul.com/zulu/bin/zulu17.64.17-ca-jdk17.0.18"
internal const val JDK11URL = "https://cdn.azul.com/zulu/bin/zulu11.86.21-ca-jdk11.0.30"
internal const val JDK8URL = "https://cdn.azul.com/zulu/bin/zulu8.92.0.21-ca-jdk8.0.482"

/**
 * Vendor, OS, Architecture, JDK version -> URL
 */
internal val azulUrlMap = buildMap {
    putAll(azulX86_64UrlMap)
    putAll(azulX86UrlMap)
    putAll(azulAarch64UrlMap)
}
