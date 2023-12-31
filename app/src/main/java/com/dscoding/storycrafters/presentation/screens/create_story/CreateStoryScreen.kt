package com.dscoding.storycrafters.presentation.screens.create_story

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.dscoding.storycrafters.presentation.navigation.NavActions
import com.dscoding.storycrafters.presentation.utils.DevicePreview
import com.dscoding.storycrafters.presentation.utils.ObserveAsEvents

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateStoryScreen(
    navActions: NavActions,
    viewModel: CreateStoryViewModel = hiltViewModel()
) {

    val state by viewModel.uiState
    val onEvent = viewModel::onEvent

    ObserveAsEvents(viewModel.eventChannelFlow) { event ->
        when (event) {
            CreateStoryViewModel.UiEvent.AddStory -> {
                navActions.goToSavedStoriesScreen()
            }
        }
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            value = state.title,
            onValueChange = { onEvent(CreateStoryEvent.SetTitle(it)) })
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = state.content,
            onValueChange = { onEvent(CreateStoryEvent.SetContent(it)) })
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { onEvent(CreateStoryEvent.AddStory) }) {
            Text(text = "Create Story")
        }
    }
}


@DevicePreview
@Composable
fun CreateStoryScreenPreview() {
    val navController = rememberNavController()
    CreateStoryScreen(navActions = remember(navController) { NavActions(navController) })
}
