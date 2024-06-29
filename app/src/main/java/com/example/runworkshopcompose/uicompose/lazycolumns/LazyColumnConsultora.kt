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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.runworkshopcompose.domain.model.Consultora


@Composable
fun LazyColumnConsultoras(consultoras: List<Consultora>, onBackClick: () -> Unit) {

    Column(modifier = Modifier) {
        Button(modifier = Modifier.padding(8.dp), onClick = {
            onBackClick()
        }) {
            Text(text = "Back")
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(consultoras) { consultora ->
                ItemConsultora(consultora = consultora)
            }
        }
    }
}


@Composable
fun ItemConsultora(consultora: Consultora) {
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
                    text = "Consultora: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = consultora.consultora)
            }
            Row {
                Text(
                    text = "Direccion: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = consultora.direccion)
            }
            Row {
                Text(
                    text = "Audiencia: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = consultora.audiencia)
            }
            Row {
                Text(
                    text = "Taller: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = consultora.taller
                )
            }
            Row {
                Text(
                    text = "Descripcion: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = consultora.descripcion
                )
            }
            Row {
                Text(
                    text = "Costo: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = consultora.costo
                )
            }
            Row {
                Text(
                    text = "Fecha: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = consultora.fecha
                )
            }
            Row {
                Text(
                    text = "Hora: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = consultora.hora
                )
            }
        }
    }
}