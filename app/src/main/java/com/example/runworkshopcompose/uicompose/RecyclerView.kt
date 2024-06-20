package com.example.runworkshopcompose.uicompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.runworkshopcompose.domain.model.Instituto


@Composable
fun RecyclerViewInstitutos(requestViewModel: RequestViewModel) {

    val institutoViewModel by requestViewModel.institutoViewModel.collectAsState()


    LazyColumn {
        items(institutoViewModel){it
            ItemInstituto(instituto = it)
        }

    }
}


@Composable
fun ItemInstituto(instituto: Instituto) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column {
            Text(
                text = instituto.instituto,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = instituto.direccion,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = instituto.audiencia,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = instituto.taller,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = instituto.descripcion,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = instituto.costo,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = instituto.fecha,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = instituto.hora,
                modifier = Modifier.align(Alignment.Start)
            )
        }
    }
}




