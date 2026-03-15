package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86

import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86.linux.azulLinuxX86UrlMap
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86.windows.azulWindowsX86UrlMap

internal val azulX86UrlMap = buildMap {
    putAll(azulLinuxX86UrlMap)
    putAll(azulWindowsX86UrlMap)
}
