package dev.pages.psuarez.examenpglpablosuarez.ui.components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import dev.pages.psuarez.examenpglpablosuarez.ui.theme.alumno3

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topbar(titulo: String) {
  CenterAlignedTopAppBar(
    title = { Text(text = titulo) },
    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
      titleContentColor = alumno3,
      containerColor = MaterialTheme.colorScheme.primary
    )
  )
}