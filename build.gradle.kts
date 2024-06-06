// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

    //A partir de Kotlin 2.0.0 se usa esta linea para compilar en compose
    alias(libs.plugins.compose.compiler) apply false

    //Dagger Hilt
    id("com.google.dagger.hilt.android") version "2.47" apply false

}