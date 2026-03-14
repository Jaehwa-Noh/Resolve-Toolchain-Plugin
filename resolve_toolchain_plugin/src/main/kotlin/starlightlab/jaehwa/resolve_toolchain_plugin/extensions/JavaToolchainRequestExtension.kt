package starlightlab.jaehwa.resolve_toolchain_plugin.extensions

import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainRequest
import org.gradle.platform.Architecture

internal fun JavaToolchainRequest.getUrl(): String? {
    val javaToolchainSpec = this.javaToolchainSpec
    val buildPlatform = this.buildPlatform

    val os = buildPlatform.operatingSystem.getAzulSupportOs()
    val vendor = javaToolchainSpec.vendor.turnIntoPluginSupportVendor()
    val javaVersion = javaToolchainSpec.languageVersion.toInt()

    val key = "$vendor-$os-${buildPlatform.architecture}-$javaVersion"

    println(key)

    return urlMap[key]
}

/**
 * Vendor, OS, Architecture, JDK version -> URL
 */
internal val urlMap = buildMap {
    // AZUL
    // note: Linux
    put(
        "$AZUL-$LINUX-${Architecture.X86_64}-$JDK_25",
        "https://cdn.azul.com/zulu/bin/zulu25.32.21-ca-jdk25.0.2-linux_x64.tar.gz"
    )
    put(
        "$AZUL-$LINUX-${Architecture.AARCH64}-$JDK_25",
        "https://cdn.azul.com/zulu/bin/zulu25.32.21-ca-jdk25.0.2-linux_aarch64.tar.gz"
    )
    // note: Mac
    put(
        "$AZUL-$MAC-${Architecture.AARCH64}-$JDK_25",
        "https://cdn.azul.com/zulu/bin/zulu25.32.21-ca-jdk25.0.2-macosx_aarch64.tar.gz"
    )
}
