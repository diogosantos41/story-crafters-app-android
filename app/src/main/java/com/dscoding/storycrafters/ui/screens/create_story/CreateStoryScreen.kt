package com.dscoding.storycrafters.ui.screens.create_story

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.dscoding.storycrafters.ui.navigation.NavActions
import com.dscoding.storycrafters.ui.utils.DevicePreview
import com.dscoding.storycrafters.ui.utils.FeatureNotImplementedScreen

@Composable
fun CreateStoryScreen(navActions: NavActions) {
    FeatureNotImplementedScreen(featureName = "Create Story")
}


@DevicePreview
@Composable
fun CreateStoryScreenPreview() {
    val navController = rememberNavController()
    CreateStoryScreen(navActions = remember(navController) { NavActions(navController) })
}
