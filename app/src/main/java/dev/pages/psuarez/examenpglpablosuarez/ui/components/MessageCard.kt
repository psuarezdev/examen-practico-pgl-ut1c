package dev.pages.psuarez.examenpglpablosuarez.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dev.pages.psuarez.examenpglpablosuarez.R
import dev.pages.psuarez.examenpglpablosuarez.domain.Message

@Composable
fun MessageCard(msg: Message, avatarResource: Int, expandedColor: Color) {
  var isExpanded by remember { mutableStateOf(false) }
  val surfaceColor by animateColorAsState(
    if (isExpanded) expandedColor else Color.LightGray,
  )

  Row(modifier = Modifier.padding(all = 8.dp)) {
    CustomAvatar(avatarResource)
    HSpace(8.dp)
    Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
      Text(
        text = msg.user,
        style = MaterialTheme.typography.titleSmall,
      )
      VSpace(4.dp)
      Surface(
        shape = MaterialTheme.shapes.medium,
        shadowElevation = 1.dp,
        color = surfaceColor,
        modifier = Modifier.animateContentSize().padding(1.dp)
      ) {
        Text(
          text = msg.text,
          modifier = Modifier.padding(all = 4.dp),
          maxLines = if (isExpanded) Int.MAX_VALUE else 1,
          style = MaterialTheme.typography.bodyMedium
        )
      }
    }
  }
}
