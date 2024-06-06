package com.example.runworkshopcompose.uicompose


import android.content.Context
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
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.runworkshopcompose.MainActivity
import com.example.runworkshopcompose.data.network.response.InstitutoModel


@Composable
fun MainScreen(requestViewModel:RequestViewModel) {

    //Aqui tenemos 3 formas de llamar a db institutos
    requestViewModel.institutoViewModel
    requestViewModel.resultOne
    requestViewModel.requestUseCase()




    //Esto es para darme una idea, actualizar el rv con la variable institutoViewModel
    /* requestViewModel.institutoViewModel.observe(this, Observer {
        RecyclerViewInstitutos.pintar = List<InstitutoModel>
    })*/

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