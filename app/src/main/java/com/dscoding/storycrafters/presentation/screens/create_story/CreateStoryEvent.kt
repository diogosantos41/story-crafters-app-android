package com.dscoding.storycrafters.presentation.screens.create_story

import com.dscoding.storycrafters.domain.model.Story

sealed interface CreateStoryEvent {
    data class EnteredTitle(val value: String) : CreateStoryEvent
    data class EnteredContent(val value: String) : CreateStoryEvent
    data object AddStory: CreateStoryEvent

}