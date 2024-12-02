plugins {
    id("com.android.application") // Plugin Android
    id("org.jetbrains.kotlin.android")
    alias(libs.plugins.google.gms.google.services) // Plugin Kotlin
}

android {
    namespace = "com.example.tasks"
    compileSdk = 35 // Compile SDK compatible avec les dernières versions des bibliothèques

    defaultConfig {
        applicationId = "com.example.tasks"
        minSdk = 24 // Compatible avec les bibliothèques modernes
        targetSdk = 35 // Aligné avec compileSdk
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
        sourceCompatibility = JavaVersion.VERSION_1_8 // Compatibilité avec Java 8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8" // Compatible avec Kotlin et Android
    }
}

dependencies {
    // AndroidX Libraries
    implementation("androidx.core:core-ktx:1.15.0") // Compatibilité compileSdk 35
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.activity:activity-ktx:1.8.0")

    // Firebase Libraries
    implementation(platform("com.google.firebase:firebase-bom:32.2.3")) // Gestion des versions Firebase
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-database-ktx")
    implementation(libs.androidx.activity)
    implementation(libs.firebase.ml.vision)

    // Testing Libraries
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
