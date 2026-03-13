plugins {
    alias(libs.plugins.android.application)
}

android {
<<<<<<< HEAD
    namespace = "com.example.capitulo4a"
=======
    namespace = "com.example.aula1"
>>>>>>> 2d0489f9596aa617858475cd59471f4b1492fb06
    compileSdk {
        version = release(36)
    }

    defaultConfig {
<<<<<<< HEAD
        applicationId = "com.example.capitulo4a"
=======
        applicationId = "com.example.aula1"
>>>>>>> 2d0489f9596aa617858475cd59471f4b1492fb06
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
<<<<<<< HEAD
    viewBinding {
        enable = true
    }
=======
>>>>>>> 2d0489f9596aa617858475cd59471f4b1492fb06
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}