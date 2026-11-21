plugins {
    id("com.android.application")
}

android {
    namespace = "co.rcestudio.ventico"
    compileSdk = 35

    defaultConfig {
        applicationId = "co.rcestudio.ventico"
        minSdk = 24
        targetSdk = 35
        // Sube versionCode en 1 cada vez que publiques una actualización.
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    lint {
        abortOnError = false
        checkReleaseBuilds = false
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.12.1")
    implementation("androidx.core:core:1.13.1")
}
