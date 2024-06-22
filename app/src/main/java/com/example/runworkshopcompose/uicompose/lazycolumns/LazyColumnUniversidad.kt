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
import com.example.runworkshopcompose.domain.model.Universidad
import com.example.runworkshopcompose.uicompose.RequestViewModel

@Composable
fun LazyColumnUniversidades(requestViewModel: RequestViewModel) {


    val universidadViewModel by requestViewModel.universidadViewModel.collectAsStateWithLifecycle()

    Scaffold() {
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
    Card(modifier = Modifier.fillMaxWidth()) {
        Column {
            Text(
                text = universidad.universidad,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = universidad.direccion,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = universidad.audiencia,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = universidad.taller,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = universidad.descripcion,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = universidad.costo,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = universidad.fecha,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = universidad.hora,
                modifier = Modifier.align(Alignment.Start)
            )
        }
    }
}
