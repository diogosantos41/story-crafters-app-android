package com.dscoding.storycrafters.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.dscoding.storycrafters.ui.navigation.NavActions
import com.dscoding.storycrafters.ui.utils.DevicePreview
import com.dscoding.storycrafters.ui.utils.FeatureNotImplementedScreen

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