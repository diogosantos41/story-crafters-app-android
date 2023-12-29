package com.dscoding.storycrafters.presentation.screens.read_story

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.dscoding.storycrafters.presentation.navigation.NavActions
import com.dscoding.storycrafters.presentation.utils.DevicePreview
import com.dscoding.storycrafters.presentation.utils.FeatureNotImplementedScreen

@Composable
fun ReadStoryScreen(navActions: NavActions) {
    FeatureNotImplementedScreen(featureName = "Read Story")
}

@DevicePreview
@Composable
fun ReadStoryScreenPreview() {
    val navController = rememberNavController()
    ReadStoryScreen(navActions = remember(navController) { NavActions(navController) })
}