package com.example.runworkshopcompose.uicompose.lazycolumns

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.runworkshopcompose.domain.model.Consultora
import com.example.runworkshopcompose.uicompose.RequestViewModel

@Composable
fun LazyColumnConsultoras(requestViewModel: RequestViewModel) {


    val consultoraViewModel by requestViewModel.consultoraViewModel.collectAsStateWithLifecycle()

    Scaffold() {
        LazyColumn(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(consultoraViewModel) { consultora ->
                ItemConsultora(consultora = consultora)
            }
        }
    }
}


@Composable
fun ItemConsultora(consultora: Consultora) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column {
            Text(
                text = consultora.consultora,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = consultora.direccion,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = consultora.audiencia,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = consultora.taller,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = consultora.descripcion,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = consultora.costo,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = consultora.fecha,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = consultora.hora,
                modifier = Modifier.align(Alignment.Start)
            )
        }
    }
}