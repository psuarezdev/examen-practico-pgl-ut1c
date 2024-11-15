package dev.pages.psuarez.examenpglpablosuarez.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CustomAvatar(avatarResource: Int) {
  Image(
    painter = painterResource(avatarResource),
    contentDescription = null,
    modifier = Modifier
      .size(40.dp)
      .clip(CircleShape)
      .border(1.5.dp, Color.LightGray, CircleShape)
  )
}