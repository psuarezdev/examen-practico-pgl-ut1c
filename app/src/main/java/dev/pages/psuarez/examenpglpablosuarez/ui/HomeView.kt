package dev.pages.psuarez.examenpglpablosuarez.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.pages.psuarez.examenpglpablosuarez.R
import dev.pages.psuarez.examenpglpablosuarez.data.Mensajes
import dev.pages.psuarez.examenpglpablosuarez.ui.components.CustomCard
import dev.pages.psuarez.examenpglpablosuarez.ui.components.MessageCard
import dev.pages.psuarez.examenpglpablosuarez.ui.components.Topbar
import dev.pages.psuarez.examenpglpablosuarez.ui.components.VSpace
import dev.pages.psuarez.examenpglpablosuarez.ui.theme.alumno3

@Composable
fun HomeView() {
  val listaColores = listOf(Color.Green, Color.Blue, Color.Red, Color.Cyan)
  var color by remember { mutableStateOf(Color.Magenta) }

  Scaffold(
    topBar = { Topbar(titulo = "Pablo Suárez") },
    modifier = Modifier.fillMaxSize(),
    contentColor = alumno3,
  ) { innerPadding ->
    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)
        .padding(vertical = 16.dp)
    ) {
      CustomCard(
        alumno = "Pablo Suárez",
        texto = "Soy un alumno",
        avatarResource = R.drawable.avatar3
      )
      Button(
        onClick = { color = listaColores.random() },
        colors = ButtonDefaults.buttonColors(
          containerColor = color,
          contentColor = alumno3
        ),
        modifier = Modifier.fillMaxWidth()
          .padding(horizontal = 40.dp)
      ) {
        Text(text = "Elegir nuevo color")
      }
      VSpace(8.dp)
      LazyColumn(
        modifier = Modifier.fillMaxWidth()
          .padding(horizontal = 12.dp)
      ) {
        items(Mensajes.conversationSample) { message ->
          MessageCard(
            msg = message,
            expandedColor = color,
            avatarResource =  R.drawable.profesor
          )
        }
      }
    }
  }
}