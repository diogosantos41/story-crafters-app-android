package com.dscoding.storycrafters.presentation.screens.saved_stories

import com.dscoding.storycrafters.domain.model.Story

data class SavedStoriesState(
    val stories: List<Story> = emptyList(),
)