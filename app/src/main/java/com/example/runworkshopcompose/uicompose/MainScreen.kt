package com.example.runworkshopcompose.uicompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import com.example.runworkshopcompose.domain.model.Instituto
import com.example.runworkshopcompose.ui.theme.Purple80
import com.example.runworkshopcompose.uicompose.lazycolumns.LazyColumnInstitutos


@Composable
fun MainScreen(requestViewModel: RequestViewModel = hiltViewModel()) {

    val institutos by requestViewModel.institutos.collectAsStateWithLifecycle()


    Scaffold(modifier = Modifier) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues = padding),
            content = {
                MyCard(
                    institutos = institutos,
                )
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Universidades")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Consultoras")
                }
            }
        )
    }
}

@Composable
fun MyCard(
    institutos: List<Instituto>
) {
    var showLazyColumn by rememberSaveable { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { showLazyColumn = true },
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(Color(Purple80.value), contentColor = Color.Black),
        border = BorderStroke(1.dp, Color.Black)
    )
    {
        Text(
            text = "Institutos",
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally), fontSize = 22.sp, fontWeight = FontWeight.Bold
        )
        if (showLazyColumn) {
            LazyColumnInstitutos(institutos) {showLazyColumn = false}
        }
    }
}

