plugins {
<<<<<<< HEAD
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
=======
    id("com.android.application") // Plugin Android pour les applications
    id("org.jetbrains.kotlin.android") // Plugin Kotlin pour Android
    id("com.google.gms.google-services") // Plugin Google Services (Firebase)
}

android {
    namespace = "com.example.tasks" // Namespace unique pour le projet
    compileSdk = 35 // Version SDK utilisée pour la compilation

    defaultConfig {
        applicationId = "com.example.tasks" // Identifiant unique de l'application
        minSdk = 24 // Version minimale supportée (Android 7.0 Nougat)
        targetSdk = 35 // Version cible (Android 13+)
        versionCode = 1 // Code de version
        versionName = "1.0" // Nom de version

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true // Activer MultiDex pour gérer les applications avec >65k méthodes
>>>>>>> 6b5740a (Premier commit)
    }

    buildTypes {
        release {
<<<<<<< HEAD
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
=======
            isMinifyEnabled = false // Désactiver la minification pour le mode debug
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), // Fichier ProGuard par défaut
                "proguard-rules.pro" // Fichier de règles personnalisé
>>>>>>> 6b5740a (Premier commit)
            )
        }
    }

    compileOptions {
<<<<<<< HEAD
        sourceCompatibility = JavaVersion.VERSION_1_8 // Compatibilité avec Java 8
=======
        sourceCompatibility = JavaVersion.VERSION_1_8 // Compatibilité Java 8
>>>>>>> 6b5740a (Premier commit)
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
<<<<<<< HEAD
        jvmTarget = "1.8" // Compatible avec Kotlin et Android
=======
        jvmTarget = "1.8" // Cible JVM pour Kotlin
    }

    buildFeatures {
        viewBinding = true // Activation de View Binding
>>>>>>> 6b5740a (Premier commit)
    }
}

dependencies {
<<<<<<< HEAD
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
=======
    // Bibliothèques AndroidX
    implementation("androidx.core:core-ktx:1.15.0") // Extensions Kotlin pour Android
    implementation("androidx.appcompat:appcompat:1.6.1") // Compatibilité avec les anciennes versions Android
    implementation("com.google.android.material:material:1.9.0") // Composants Material Design
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // Gestion des contraintes
    implementation("androidx.activity:activity-ktx:1.8.0") // Extensions Activity pour Kotlin
    implementation("androidx.drawerlayout:drawerlayout:1.1.1") // DrawerLayout pour les menus latéraux

    // Firebase (gestion via Firebase BOM pour éviter les conflits de versions)
    implementation(platform("com.google.firebase:firebase-bom:32.3.1")) // Déclare Firebase BOM
    implementation("com.google.firebase:firebase-firestore") // Firestore
    implementation("com.google.firebase:firebase-auth") // Authentification Firebase

    // Google Play Services pour l'authentification
    implementation("com.google.android.gms:play-services-auth:20.3.0")

    // Bibliothèque standard Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.0")

    // Picasso pour le chargement et la gestion des images
    implementation("com.squareup.picasso:picasso:2.8")

    // Bibliothèques de tests unitaires
    testImplementation("junit:junit:4.13.2") // Tests unitaires avec JUnit
    androidTestImplementation("androidx.test.ext:junit:1.1.5") // Tests Android avec JUnit
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1") // Espresso pour tests UI
>>>>>>> 6b5740a (Premier commit)
}
