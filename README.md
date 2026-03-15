# Reslove Toolchain Plugin

> [!Note]
> Require Gradle version 7.6 and above!  
> In Gradle version 7.6 and above, Gradle provides a way to define Java toolchain auto-provisioning logic in plugins.

## How to use
in `settings.gradle.kts`
```kotlin
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()  // <- add this
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()  // <- add this
    }
}
```

### 1. Easy way
```kotlin
plugins {
    id("io.github.jaehwa-noh.resolve-toolchain-plugin-presetting").version("1.0.0-alpha01")
}
```


### 2. Manual
```kotlin
plugins {
    id("io.github.jaehwa-noh.resolve-toolchain-plugin").version("1.0.0-alpha01")
}

toolchainManagement {
    jvm {
        javaRepositories {
            repository("resolveToolchainPlugin") {
                resolverClass.set(
                    starlightlab.jaehwa.resolve_toolchain_plugin.JavaToolchainResolverImplementation::class.java
                )
            }
        }
    }
}
```
