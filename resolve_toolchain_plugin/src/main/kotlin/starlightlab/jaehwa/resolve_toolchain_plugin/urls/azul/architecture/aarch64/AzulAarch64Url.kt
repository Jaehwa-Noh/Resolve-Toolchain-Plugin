package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.aarch64

import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.aarch64.linux.azulLinuxAarch64UrlMap
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.aarch64.mac.azulMacAarch64UrlMap
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.aarch64.solaris.azulSolarisAarch64UrlMap
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.aarch64.windows.azulWindowsAarch64UrlMap

internal val azulAarch64UrlMap = buildMap {
    putAll(azulLinuxAarch64UrlMap)
    putAll(azulMacAarch64UrlMap)
    putAll(azulWindowsAarch64UrlMap)
    putAll(azulSolarisAarch64UrlMap)
}
