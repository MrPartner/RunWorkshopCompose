package com.example.runworkshopcompose.uicompose.lazycolumns

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.runworkshopcompose.domain.model.Instituto
import com.example.runworkshopcompose.uicompose.MainScreen
import com.example.runworkshopcompose.uicompose.RequestViewModel


@Composable
fun LazyColumnInstitutos(requestViewModel: RequestViewModel) {

    val institutoViewModel by requestViewModel.institutoViewModel.collectAsStateWithLifecycle()
    var showMainScreen by rememberSaveable { mutableStateOf(false) }

    Scaffold(modifier = Modifier, containerColor = Color(0x802A49F3)) {innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Button(onClick = {
                showMainScreen = true
            }) {
                Text(text = "Back")
            }
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(institutoViewModel) { instituto ->
                    ItemInstituto(instituto = instituto)
                }
            }
        }
        if (showMainScreen) {
            MainScreen(requestViewModel)
        }
    }
}


@Composable
fun ItemInstituto(instituto: Instituto) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        border = BorderStroke(1.dp, Color.Black),
        colors = CardDefaults.cardColors(Color(0xFFFFFFFF), contentColor = Color.Black)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row {
                Text(
                    text = "Instituto: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = instituto.instituto)
            }
            Row {
                Text(
                    text = "Direccion: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = instituto.direccion)
            }
            Row {
                Text(
                    text = "Audiencia: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = instituto.audiencia)
            }
            Row {
                Text(
                    text = "Taller: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = instituto.taller
                )
            }
            Row {
                Text(
                    text = "Descripcion: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = instituto.descripcion
                )
            }
            Row {
                Text(
                    text = "Costo: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = instituto.costo
                )
            }
            Row {
                Text(
                    text = "Fecha: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = instituto.fecha
                )
            }
            Row {
                Text(
                    text = "Hora: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = instituto.hora
                )
            }
        }
    }
}
