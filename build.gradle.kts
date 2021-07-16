plugins {
    application
    java
    kotlin("jvm") version "1.5.10"
    kotlin("kapt") version "1.5.10"
}

object V {
    const val dsljson = "1.9.8"
}

repositories {
    mavenLocal()
    mavenCentral()
}

kotlin {
    tasks {
        compileKotlin {
            kotlinOptions {
                apiVersion = "1.5"
                languageVersion = "1.5"
                jvmTarget = "1.8"
                sourceCompatibility = "1.8"
                targetCompatibility = "1.8"
            }
        }
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("com.dslplatform:dsl-json-java8:${V.dsljson}")
    kapt("com.dslplatform:dsl-json-java8:${V.dsljson}")
}
