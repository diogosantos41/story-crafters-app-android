package com.dscoding.storycrafters.presentation.screens.saved_stories

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.dscoding.storycrafters.presentation.navigation.NavActions
import com.dscoding.storycrafters.presentation.screens.common_components.TopAppBarUI
import com.dscoding.storycrafters.presentation.utils.DevicePreview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SavedStoriesScreen(
    navActions: NavActions,
    viewModel: SavedStoriesViewModel = hiltViewModel()
) {
    val state by viewModel.uiState
    val onEvent = viewModel::onEvent

    Scaffold(topBar = {
        TopAppBarUI(
            title = "Saved Stories #",
            onBackPressed = navActions.upPress
        )
    }, content = { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(color = MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            items(state.stories) { story ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp)
                ) {
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = story.title,
                            fontSize = 20.sp,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                        Text(
                            text = story.content,
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                    IconButton(onClick = {
                        onEvent(SavedStoriesEvent.DeleteStory(story))
                    }) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Delete contact",
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                }
            }
        }
    })
}

@DevicePreview
@Composable
fun SavedStoriesScreenPreview() {
    val navController = rememberNavController()
    SavedStoriesScreen(navActions = remember(navController) { NavActions(navController) })
}