package com.example.runworkshopcompose.uicompose


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun MainScreen(requestViewModel:RequestViewModel) {

    requestViewModel.requestUseCase()

    Column(Modifier.fillMaxSize().background(Color.White).padding(26.dp)){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Institutos")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Universidades")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Consultoras")
        }
    }

}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview(){
//    RunWorkshopComposeTheme{
//        MainScreen(requestViewModel = )
//    }
//}