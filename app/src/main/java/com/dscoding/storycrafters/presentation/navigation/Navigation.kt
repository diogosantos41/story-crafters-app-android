package com.dscoding.storycrafters.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dscoding.storycrafters.presentation.screens.create_story.CreateStoryScreen
import com.dscoding.storycrafters.presentation.screens.dashboard.DashboardScreen
import com.dscoding.storycrafters.presentation.screens.read_story.ReadStoryScreen
import com.dscoding.storycrafters.presentation.screens.saved_stories.SavedStoriesScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    navActions: NavActions,
) {
    NavHost(
        navController = navController,
        startDestination = Destination.DashboardScreen.route
    ) {
        composable(
            route = Destination.DashboardScreen.route,
        ) {
            DashboardScreen(navActions = navActions)
        }
        composable(
            route = Destination.CreateStoryScreen.route,
        ) {
            CreateStoryScreen(navActions = navActions)
        }
        composable(
            route = Destination.ReadStoryScreen.route,
        ) {
            ReadStoryScreen(navActions = navActions)
        }
        composable(
            route = Destination.SavedStoriesScreen.route,
        ) {
            SavedStoriesScreen(navActions = navActions)
        }
        composable(
            route = Destination.SettingsScreen.route,
        ) {
            //SettingsScreen(navActions = navActions)
        }
    }
}

class NavActions(private val navController: NavController) {

    val upPress: () -> Unit = {
        navController.navigateUp()
    }

    val goToDashboardScreen: () -> Unit = {
        navController.navigate(Destination.DashboardScreen.route)
    }

    val goToCreateStoryScreen: () -> Unit = {
        navController.navigate(Destination.CreateStoryScreen.route)
    }

    val goToReadStoryScreen: (String) -> Unit = { storyId ->
        navController.navigate(Destination.ReadStoryScreen.route)
    }

    val goToSavedStoriesScreen: () -> Unit = {
        navController.navigate(Destination.SavedStoriesScreen.route)
    }

    val goToSettings: () -> Unit = {
        navController.navigate(Destination.SettingsScreen.route)
    }


}