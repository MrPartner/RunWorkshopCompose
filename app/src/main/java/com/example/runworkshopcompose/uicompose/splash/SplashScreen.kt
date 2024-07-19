package com.example.runworkshopcompose.uicompose.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    splashViewModel: SplashViewModel = hiltViewModel(),
    navigateToLoginScreen: () -> Unit,
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize().background(Color.Magenta)
    ) {
        CircularProgressIndicator()
        LaunchedEffect(key1 = true) {
            delay(3000) // Espera 3 segundos
            navigateToLoginScreen()
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(navigateToLoginScreen = {})
}