plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.pmob.aspirasiku"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.pmob.aspirasiku"
        minSdk = 21
        targetSdk = 35
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.messaging)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    // RecyclerView
    implementation(libs.recyclerview)

    // CardView (opsional)
    implementation(libs.cardview)

    // Glide untuk gambar
    implementation(libs.glide)
    annotationProcessor(libs.compiler)

    // Material Design
    implementation(libs.material.v1110)

    // Android Navigation Component
    implementation(libs.navigation.fragment.ktx) // TAMBAHKAN INI
    implementation(libs.navigation.ui.ktx)       // TAMBAHKAN INI
}