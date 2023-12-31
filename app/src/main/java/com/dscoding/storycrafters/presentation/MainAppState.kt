package com.dscoding.storycrafters.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.dscoding.storycrafters.presentation.navigation.Destination
import com.dscoding.storycrafters.presentation.navigation.toDestination

@Composable
fun rememberMainAppState(navController: NavHostController = rememberNavController()) =
    remember(navController) {
        MainAppState(navController)
    }

@Stable
class MainAppState(private val navController: NavHostController) {

    private val currentNavDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    private val currentDestination: Destination?
        @Composable get() = currentNavDestination?.route?.toDestination()

    val showTopAppBar: Boolean
        @Composable get() = currentNavDestination?.route != Destination.DashboardScreen.route


    val currentDestinationTitle: String
        @Composable get() = currentDestination?.strResource?.asString() ?: ""

}