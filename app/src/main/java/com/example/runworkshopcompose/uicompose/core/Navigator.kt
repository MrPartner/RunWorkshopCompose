package com.example.runworkshopcompose.uicompose.core

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.runworkshopcompose.uicompose.MainScreen
import com.example.runworkshopcompose.uicompose.core.Routes.*

@Composable
fun ContentWrapper(navigationController: NavHostController) {
    NavHost(navController = navigationController, startDestination = MainScreen.route) {
        composable(MainScreen.route) {
            MainScreen()
        }
    }
}

sealed class Routes(val route: String) {
    data object MainScreen : Routes("MainScreen")

}