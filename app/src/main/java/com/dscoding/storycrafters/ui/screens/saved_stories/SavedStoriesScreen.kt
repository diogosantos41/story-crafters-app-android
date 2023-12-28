package com.dscoding.storycrafters.ui.screens.saved_stories

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.dscoding.storycrafters.ui.navigation.NavActions
import com.dscoding.storycrafters.ui.utils.DevicePreview
import com.dscoding.storycrafters.ui.utils.FeatureNotImplementedScreen

@Composable
fun SavedStoriesScreen(navActions: NavActions) {
    FeatureNotImplementedScreen(featureName = "Saved Stories")
}

@DevicePreview
@Composable
fun SavedStoriesScreenPreview() {
    val navController = rememberNavController()
    SavedStoriesScreen(navActions = remember(navController) { NavActions(navController) })
}