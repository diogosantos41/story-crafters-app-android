package com.dscoding.storycrafters.presentation.screens.generate_cookies

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.dscoding.storycrafters.presentation.navigation.NavActions
import com.dscoding.storycrafters.presentation.utils.DevicePreview
import com.dscoding.storycrafters.presentation.utils.FeatureNotImplementedScreen

@Composable
fun GenerateCookiesScreen(navActions: NavActions) {
    FeatureNotImplementedScreen(featureName = "Generate Cookies")
}

@DevicePreview
@Composable
fun ReadStoryScreenPreview() {
    val navController = rememberNavController()
    GenerateCookiesScreen(navActions = remember(navController) { NavActions(navController) })
}