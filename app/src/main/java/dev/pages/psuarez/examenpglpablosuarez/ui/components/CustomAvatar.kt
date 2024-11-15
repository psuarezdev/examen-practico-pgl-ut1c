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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.pages.psuarez.examenpglpablosuarez.ui.theme.customLightGray

@Composable
fun CustomAvatar(avatarResource: Int, size: Dp = 40.dp) {
  Image(
    painter = painterResource(avatarResource),
    contentDescription = null,
    modifier = Modifier
      .size(size)
      .clip(CircleShape)
      .border(1.5.dp, customLightGray, CircleShape)
  )
}