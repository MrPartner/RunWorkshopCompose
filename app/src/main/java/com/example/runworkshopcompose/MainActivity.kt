package com.example.runworkshopcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.Observer
import com.example.runworkshopcompose.ui.theme.RunWorkshopComposeTheme
import com.example.runworkshopcompose.uicompose.MainScreen
import com.example.runworkshopcompose.uicompose.RequestViewModel
import dagger.hilt.android.AndroidEntryPoint

@Suppress("UNUSED_EXPRESSION")
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val requestViewModel:RequestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RunWorkshopComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { it
                    MainScreen(requestViewModel)
                }
            }
        }

        /* Aqui si podemos recuperar el contexto
        requestViewModel.institutoViewModel.observe(this, Observer {
            actualizamos valores con viewModel
        })*/
    }
}

