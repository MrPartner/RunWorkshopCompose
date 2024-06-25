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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.runworkshopcompose.domain.model.Instituto
import com.example.runworkshopcompose.domain.model.Universidad
import com.example.runworkshopcompose.uicompose.RequestViewModel

@Composable
fun LazyColumnUniversidades(requestViewModel: RequestViewModel) {


    val universidadViewModel by requestViewModel.universidadViewModel.collectAsStateWithLifecycle()

    Scaffold(modifier = Modifier, containerColor = Color(0x802A49F3)) {
        LazyColumn(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(universidadViewModel) { universidad ->
                ItemUniversidad(universidad = universidad)
            }
        }
    }
}


@Composable
fun ItemUniversidad(universidad: Universidad) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        border = BorderStroke(1.dp, Color.Black),
        colors = CardDefaults.cardColors(Color(0xFFFFFFFF), contentColor = Color.Black)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Universidad: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = universidad.universidad)
            }
            Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Direccion: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = universidad.direccion)
            }
            Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Audiencia: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = universidad.audiencia)
            }
            Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Taller: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = universidad.taller
                )
            }
            Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Descripcion: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = universidad.descripcion
                )
            }
            Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Costo: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = universidad.costo
                )
            }
            Row {
                Text(
                    text = "Fecha: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = universidad.fecha
                )
            }
            Row {
                Text(
                    text = "Hora: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = universidad.hora
                )
            }
        }
    }
}