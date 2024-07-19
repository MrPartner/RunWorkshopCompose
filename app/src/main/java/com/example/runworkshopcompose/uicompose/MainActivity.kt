package com.example.runworkshopcompose.uicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.runworkshopcompose.uicompose.theme.RunWorkshopComposeTheme
import com.example.runworkshopcompose.uicompose.core.ContentWrapper
import com.example.runworkshopcompose.uicompose.login.LoginScreen

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navigationController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RunWorkshopComposeTheme {
//                navigationController = rememberNavController()
//                ContentWrapper(navigationController)
                LoginScreen()
            }
        }


    }
}

