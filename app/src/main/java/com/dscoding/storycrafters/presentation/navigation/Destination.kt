package com.dscoding.storycrafters.presentation.navigation


sealed class Destination(val route: String) {
    data object DashboardScreen : Destination(route = "dashboard_screen")
    data object CreateStoryScreen : Destination(route = "create_story_screen")
    data object ReadStoryScreen : Destination(route = "read_story_screen")
    data object SavedStoriesScreen : Destination(route = "saved_stories_screen")
    data object GenerateCookiesScreen : Destination(route = "generate_cookies_screen")
    data object SettingsScreen : Destination(route = "settings_screen")
}