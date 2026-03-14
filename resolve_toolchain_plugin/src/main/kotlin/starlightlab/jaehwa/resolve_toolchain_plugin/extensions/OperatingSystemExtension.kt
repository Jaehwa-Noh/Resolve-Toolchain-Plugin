package starlightlab.jaehwa.resolve_toolchain_plugin.extensions

import org.gradle.platform.OperatingSystem

internal const val LINUX = "linux"
internal const val WINDOW = "window"
internal const val MAC = "mac"
internal const val SOLARIS = "solaris"

/**
 * Turn into Azul support OS
 */
internal fun OperatingSystem.getAzulSupportOs() =
    when (this) {
        OperatingSystem.LINUX, OperatingSystem.UNIX, OperatingSystem.FREE_BSD -> LINUX
        OperatingSystem.WINDOWS -> WINDOW
        OperatingSystem.MAC_OS -> MAC
        OperatingSystem.SOLARIS -> SOLARIS
    }
