package com.dscoding.storycrafters.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.dscoding.storycrafters.presentation.navigation.NavActions
import com.dscoding.storycrafters.presentation.navigation.NavGraph

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp() {
    val navController = rememberNavController()
    val navActions = remember(navController) { NavActions(navController) }
    val state = rememberMainAppState(navController = navController)

    Surface {
        Scaffold(topBar = {
            TopAppBar(
                visible = state.showTopAppBar,
                title = state.currentDestinationTitle,
                onBackPressed = navActions.upPress
            )
        }, content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                NavGraph(
                    navController = navController,
                    navActions = navActions,
                )
            }
        })
    }
}

@ExperimentalMaterial3Api
@Composable
fun TopAppBar(
    visible: Boolean,
    title: String,
    onBackPressed: () -> Unit
) {
    if (visible) {
        TopAppBar(title = {
            Text(
                text = title,
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.titleMedium
            )
        }, navigationIcon = {
            IconButton(onClick = onBackPressed) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Go back icon",
                    tint = MaterialTheme.colorScheme.onBackground
                )
            }
        }
        )
    }
}


