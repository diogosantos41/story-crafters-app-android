package com.dscoding.storycrafters.presentation.screens.saved_stories

import com.dscoding.storycrafters.domain.model.Story

sealed interface SavedStoriesEvent {

    data class DeleteStory(val story: Story): SavedStoriesEvent
}