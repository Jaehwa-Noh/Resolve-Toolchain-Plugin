# Reslove Toolchain Plugin
> [!Note]
> Require Gradle version 7.6 and above!  
> In Gradle version 7.6 and above, Gradle provides a way to define Java toolchain auto-provisioning logic in plugins.

## Why I made this plugin
Another toolchain resolver plugins use middleware to get endpoint download URL.  
That architecture has security issues, such as easily change the endpoint URL without consumer notices.
No need to update plugin just change the middleware API.   

Then, this plugin uses the HARD CORDING endpoint URL from official site.
Consumer easily check that endpoint URL in this repository files and the only way to modify URL is plugin version change.

## Supported JDKs

### JDK versions
|        | Azul Zulu |
|--------|-----------|
 | JDK 8  | &#x2705;  |
| JDK 11 | &#x2705;  |
| JDK 17 |  &#x2705; |
| JDK 21 | &#x2705; |
| JDK 25 | &#x2705; |


### JDK information
|    JDK      |                    Official site                         |                                 License                             | 
|-------------|----------------------------------------------------------|---------------------------------------------------------------------|
| Azul Zulu   | [site](https://www.azul.com/downloads/?package=jdk#zulu) | [license](https://www.azul.com/products/core/openjdk-terms-of-use/) |



Another JDKs next release version will be treat.


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
### Set up
#### • Easy way
```kotlin
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal() 
    }
}

// Add this `plugins` in `settings.gradle.kts`
plugins {
    id("io.github.jaehwa-noh.resolve-toolchain-plugin-presetting").version("1.0.0-alpha01")
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
```

done.

#### • Manually way
```kotlin
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

// Add this `plugins` and `toolchainManagement` in `settings.gradle.kts`
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

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
```
done.

### Apply (Set toolchain)
in module's `build.gradle.kts`
```gradle
kotlin {
    compilerOptions {
        jvmToolchain {
            languageVersion = JavaLanguageVersion.of(21)
        }
    }
}
```

or 
```gradle
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
```


### Example
```gradle
kotlin {
    compilerOptions {
        jvmToolchain {
            languageVersion = JavaLanguageVersion.of(21)
            vendor = JvmVendorSpec.IBM  
            // You can set JDK Vendor but this plugin only can download from `Supported JDK section` vendor.
            // Otherwise, Azul(Default) JDK will be downloaded
            // So that this request downloads Azul JDK 21.
        }
    }
}
```

### Contributing
Open to contribute to anyone, fork and create a PR.
