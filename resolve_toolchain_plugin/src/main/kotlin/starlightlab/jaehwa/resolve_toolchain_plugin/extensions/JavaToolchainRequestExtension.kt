package starlightlab.jaehwa.resolve_toolchain_plugin.extensions

import org.gradle.jvm.toolchain.JavaToolchainRequest
import starlightlab.jaehwa.resolve_toolchain_plugin.urls.allUrlsMap

internal fun JavaToolchainRequest.getUrl(): String? {
    val javaToolchainSpec = this.javaToolchainSpec
    val buildPlatform = this.buildPlatform

    val os = buildPlatform.operatingSystem.getAzulSupportOs()
    val vendor = javaToolchainSpec.vendor.turnIntoPluginSupportVendor()
    val javaVersion = javaToolchainSpec.languageVersion.toInt()

    val key = "$vendor-$os-${buildPlatform.architecture}-$javaVersion"
    val url = allUrlsMap[key]

    if (url == null) println("Your JDK request($key) doesn't managed by this plugin.")

    return url
}
