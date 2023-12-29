package com.dscoding.storycrafters.presentation.screens.saved_stories

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.dscoding.storycrafters.presentation.navigation.NavActions
import com.dscoding.storycrafters.presentation.utils.DevicePreview
import com.dscoding.storycrafters.presentation.utils.FeatureNotImplementedScreen

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