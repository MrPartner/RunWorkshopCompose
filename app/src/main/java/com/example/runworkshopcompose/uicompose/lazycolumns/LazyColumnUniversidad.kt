package com.example.runworkshopcompose.uicompose.lazycolumns

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.runworkshopcompose.R
import com.example.runworkshopcompose.domain.model.Consultora
import com.example.runworkshopcompose.domain.model.Universidad
import com.example.runworkshopcompose.uicompose.RequestViewModel

@Composable
fun LazyColumnUniversidades(universidades: List<Universidad>, onBackClick: () -> Unit) {

    Column(modifier = Modifier) {
        Button(modifier = Modifier.padding(horizontal = 8.dp), onClick = {
            onBackClick()
        }) {
            Image(painter = painterResource(id = R.drawable.ic_back), contentDescription = "volver")
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(universidades) { universidad ->
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
            Row{
                Text(
                    text = "Universidad: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = universidad.universidad)
            }
            Row{
                Text(
                    text = "Direccion: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = universidad.direccion)
            }
            Row{
                Text(
                    text = "Audiencia: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(text = universidad.audiencia)
            }
            Row{
                Text(
                    text = "Taller: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = universidad.taller
                )
            }
            Row{
                Text(
                    text = "Descripcion: ",
                    modifier = Modifier,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = universidad.descripcion
                )
            }
            Row{
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