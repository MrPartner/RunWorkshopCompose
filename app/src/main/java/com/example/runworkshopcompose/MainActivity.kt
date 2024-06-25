package com.example.runworkshopcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.runworkshopcompose.ui.theme.RunWorkshopComposeTheme
import com.example.runworkshopcompose.uicompose.MainScreen
import com.example.runworkshopcompose.uicompose.RequestViewModel
import com.example.runworkshopcompose.uicompose.lazycolumns.LazyColumnConsultoras
import com.example.runworkshopcompose.uicompose.lazycolumns.LazyColumnInstitutos
import com.example.runworkshopcompose.uicompose.lazycolumns.LazyColumnUniversidades
import dagger.hilt.android.AndroidEntryPoint



@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val requestViewModel:RequestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RunWorkshopComposeTheme {
                MainScreen(requestViewModel)
            }
        }


    }
}

