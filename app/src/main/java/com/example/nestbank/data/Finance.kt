package com.example.nestbank.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class Finance(
    val icon: ImageVector,
    val name: String,
    val background: Color,
    val route: String
)