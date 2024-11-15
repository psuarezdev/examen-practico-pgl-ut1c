package dev.pages.psuarez.examenpglpablosuarez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.pages.psuarez.examenpglpablosuarez.ui.HomeView
import dev.pages.psuarez.examenpglpablosuarez.ui.theme.ExamenPGLPabloSuarezTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      ExamenPGLPabloSuarezTheme {
        HomeView()
      }
    }
  }
}