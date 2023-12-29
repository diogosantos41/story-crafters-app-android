package com.dscoding.storycrafters.presentation.navigation


import com.dscoding.storycrafters.R
import com.dscoding.storycrafters.common.StringResource

sealed class Destination(val strResource: StringResource? = null, val route: String) {
    data object DashboardScreen : Destination(
        strResource = StringResource(resId = R.string.dashboard_screen_page_title),
        route = "dashboard_screen"
    )
    data object CreateStoryScreen : Destination(
        strResource = StringResource(resId = R.string.create_story_screen_page_title),
        route = "create_story_screen"
    )

    data object ReadStoryScreen : Destination(
        strResource = StringResource(resId = R.string.read_story_screen_page_title),
        route = "read_story_screen"
    )

    data object SavedStoriesScreen : Destination(
        strResource = StringResource(resId = R.string.saved_stories_screen_page_title),
        route = "saved_stories_screen"
    )

    data object SettingsScreen : Destination(
        strResource = StringResource(resId = R.string.settings_screen_page_title),
        route = "settings_screen"
    )
}

fun String.toDestination(): Destination? {
    return when (this) {
        Destination.DashboardScreen.route -> Destination.DashboardScreen
        Destination.CreateStoryScreen.route -> Destination.CreateStoryScreen
        Destination.ReadStoryScreen.route -> Destination.ReadStoryScreen
        Destination.SavedStoriesScreen.route -> Destination.SavedStoriesScreen
        Destination.SettingsScreen.route -> Destination.SettingsScreen
        else -> null
    }
}