package com.dscoding.storycrafters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dscoding.storycrafters.presentation.MainApp
import com.dscoding.storycrafters.ui.theme.StoryCraftersTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StoryCraftersTheme { MainApp() }
        }
    }
}