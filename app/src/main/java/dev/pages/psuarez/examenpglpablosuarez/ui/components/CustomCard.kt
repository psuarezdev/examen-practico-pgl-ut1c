package dev.pages.psuarez.examenpglpablosuarez.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.pages.psuarez.examenpglpablosuarez.R

@Composable
fun CustomCard(avatarResource: Int, alumno: String, texto: String) {
  Card(
    modifier = Modifier.padding(28.dp),
    colors = CardDefaults.cardColors(
      containerColor = Color.LightGray,
    )
  ) {
    Row(
      modifier = Modifier.padding(28.dp),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      CustomAvatar(avatarResource)
      HSpace(8.dp)
      Column(verticalArrangement = Arrangement.Center) {
        Text(text = alumno, fontSize = 20.sp)
        Text(text = texto, fontSize = 20.sp)
      }
    }
  }
}