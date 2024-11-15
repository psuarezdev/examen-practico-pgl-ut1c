package dev.pages.psuarez.examenpglpablosuarez.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.pages.psuarez.examenpglpablosuarez.ui.theme.customLightGray

@Composable
fun CustomCard(avatarResource: Int, alumno: String, texto: String) {
  Card(
    colors = CardDefaults.cardColors(
      containerColor = customLightGray,
    ),
    modifier = Modifier.fillMaxWidth()
      .padding(16.dp)
      .border(1.5.dp, Color.LightGray, RectangleShape),
  ) {
    Row(
      modifier = Modifier.padding(28.dp),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      CustomAvatar(
        avatarResource = avatarResource,
        size = 75.dp
      )
      HSpace(8.dp)
      Column(verticalArrangement = Arrangement.Center) {
        Text(text = "Alumno: $alumno", fontSize = 22.sp)
        Text(text = texto, fontSize = 20.sp)
      }
    }
  }
}