package com.dscoding.storycrafters.presentation.screens.create_story

sealed interface CreateStoryEvent {
    data class SetTitle(val value: String) : CreateStoryEvent
    data class SetContent(val value: String) : CreateStoryEvent
    data object AddStory: CreateStoryEvent

}