package com.example.runworkshopcompose.uicompose.core

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.runworkshopcompose.uicompose.mainscreen.MainScreen
import com.example.runworkshopcompose.uicompose.core.Routes.*
import com.example.runworkshopcompose.uicompose.splash.SplashScreen
import com.example.runworkshopcompose.uicompose.login.LoginScreen
import com.example.runworkshopcompose.uicompose.detail.DetailScreen
import com.example.runworkshopcompose.uicompose.signup.SignUpScreen

@Composable
fun ContentWrapper(navigationController: NavHostController) {
    NavHost(navController = navigationController, startDestination = LoginScreen.route) {
        composable(SplashScreen.route) {
            SplashScreen(navigateToLoginScreen = {navigationController.navigate(LoginScreen.route)})
        }
        composable(LoginScreen.route) {
            LoginScreen()
        }
        composable(SignUpScreen.route) {
            SignUpScreen()
        }
        composable(DetailScreen.route) {
            DetailScreen()
        }
        composable(MainScreen.route) {
            MainScreen()
        }

    }
}


sealed class Routes(val route: String) {
    data object MainScreen : Routes("MainScreen")
    data object SplashScreen : Routes("SplashScreen")
    data object LoginScreen : Routes("LoginScreen")
    data object DetailScreen : Routes("DetailScreen")
    data object SignUpScreen : Routes("SignUpScreen")


}