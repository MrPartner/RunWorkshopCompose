package com.example.runworkshopcompose.uicompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.runworkshopcompose.domain.model.Consultora
import com.example.runworkshopcompose.domain.model.Instituto
import com.example.runworkshopcompose.domain.model.Universidad
import com.example.runworkshopcompose.ui.theme.Purple80
import com.example.runworkshopcompose.uicompose.lazycolumns.LazyColumnConsultoras
import com.example.runworkshopcompose.uicompose.lazycolumns.LazyColumnInstitutos
import com.example.runworkshopcompose.uicompose.lazycolumns.LazyColumnUniversidades


@Composable
fun MainScreen(requestViewModel: RequestViewModel = hiltViewModel()) {

    val institutos by requestViewModel.institutos.collectAsStateWithLifecycle()
    val universidades by requestViewModel.universidades.collectAsStateWithLifecycle()
    val consultoras by requestViewModel.consultoras.collectAsStateWithLifecycle()


    Scaffold(modifier = Modifier) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues = padding),
            content = {
                MyCardInstitutos(
                    institutos = institutos
                )
                MyCardUniversidades(
                    universidades = universidades
                )
                MyCardConsultoras(
                    consultoras = consultoras
                )
            }
        )
    }
}

@Composable
fun MyCardInstitutos(
    institutos: List<Instituto>
) {
    var showLazyColumnInstitutos by rememberSaveable { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { showLazyColumnInstitutos = true },
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(Color(Purple80.value), contentColor = Color.Black),
        border = BorderStroke(1.dp, Color.Black)
    )
    {
        Text(
            text = "Institutos",
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.CenterHorizontally), fontSize = 22.sp, fontWeight = FontWeight.Bold
        )
        if (showLazyColumnInstitutos) {
            LazyColumnInstitutos(institutos) {showLazyColumnInstitutos = false}
        }
    }
}

@Composable
fun MyCardUniversidades(
    universidades: List<Universidad>
) {
    var showLazyColumnUniversidades by rememberSaveable { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { showLazyColumnUniversidades = true },
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(Color(Purple80.value), contentColor = Color.Black),
        border = BorderStroke(1.dp, Color.Black)
    )
    {
        Text(
            text = "Universidades",
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.CenterHorizontally), fontSize = 22.sp, fontWeight = FontWeight.Bold
        )
        if (showLazyColumnUniversidades) {
            LazyColumnUniversidades(universidades) {showLazyColumnUniversidades = false}
        }
    }
}

@Composable
fun MyCardConsultoras(
    consultoras: List<Consultora>
) {
    var showLazyColumnConsultoras by rememberSaveable { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { showLazyColumnConsultoras = true },
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(Color(Purple80.value), contentColor = Color.Black),
        border = BorderStroke(1.dp, Color.Black)
    )
    {
        Text(
            text = "Consultoras",
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.CenterHorizontally), fontSize = 22.sp, fontWeight = FontWeight.Bold
        )
        if (showLazyColumnConsultoras) {
            LazyColumnConsultoras(consultoras) {showLazyColumnConsultoras = false}
        }
    }
}