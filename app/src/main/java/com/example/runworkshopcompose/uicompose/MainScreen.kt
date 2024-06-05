package com.example.runworkshopcompose.uicompose

import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.runworkshopcompose.ui.theme.RunWorkshopComposeTheme


@Composable
fun MainScreen(requestViewModel:RequestViewModel) {

    Column(Modifier.fillMaxSize()){
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