package dev.pages.psuarez.examenpglpablosuarez.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun HSpace(space: Dp) {
  Spacer(modifier = Modifier.width(space))
}