package starlightlab.jaehwa.resolve_toolchain_plugin.extensions

import org.gradle.api.provider.Property
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JvmVendorSpec

internal const val AZUL = "azul"

/**
 * Turn into this plugin support vendor
 * - Azul
 */
@Suppress("SameReturnValue") // todo: Remove this Suppress when plugin supports another vendors
internal fun Property<JvmVendorSpec>.turnIntoPluginSupportVendor() = when (this.get()) {
    JvmVendorSpec.AZUL -> AZUL
    else -> AZUL
}

internal const val JDK_25 = 25
internal const val JDK_21 = 21
internal const val JDK_17 = 17
internal const val JDK_11 = 11
internal const val JDK_8 = 8
internal const val JDK_UNKNOWN = 0

internal fun Property<JavaLanguageVersion>.toInt() = when(this.get()) {
    JavaLanguageVersion.of(25) -> JDK_25
    JavaLanguageVersion.of(21) -> JDK_21
    JavaLanguageVersion.of(17) -> JDK_17
    else -> JDK_UNKNOWN
}
