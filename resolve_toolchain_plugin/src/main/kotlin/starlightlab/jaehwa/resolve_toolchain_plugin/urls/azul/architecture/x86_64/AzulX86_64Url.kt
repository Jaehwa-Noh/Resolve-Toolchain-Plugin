package starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86_64

import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86_64.linux.azulLinuxX86_64UrlMap
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86_64.mac.azulMacX86_64UrlMap
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86_64.solaris.azulSolariseX86_64UrlMap
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.azul.architecture.x86_64.windows.azulWindowsX86_64UrlMap

internal val azulX86_64UrlMap = buildMap {
    putAll(azulLinuxX86_64UrlMap)
    putAll(azulMacX86_64UrlMap)
    putAll(azulWindowsX86_64UrlMap)
    putAll(azulSolariseX86_64UrlMap)
}
