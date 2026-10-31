plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.modo.ai"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.modo.ai"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        // ⬇️⬇️ غيّر الرابط ده برابط منصتك على GitHub Pages (لازم ينتهي بـ /) ⬇️⬇️
        buildConfigField("String", "START_URL", "\"https://USERNAME.github.io/REPO/\"")
    }

    buildFeatures { buildConfig = true }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
