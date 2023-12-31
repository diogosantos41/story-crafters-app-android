package com.dscoding.storycrafters.presentation.screens.saved_stories

import androidx.lifecycle.viewModelScope
import com.dscoding.storycrafters.domain.repository.StoryRepository
import com.dscoding.storycrafters.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SavedStoriesViewModel @Inject constructor(private val storyRepository: StoryRepository) :
    BaseViewModel<SavedStoriesState>() {

    private var getSavedStories: Job? = null

    override fun initialState(): SavedStoriesState {
        return SavedStoriesState()
    }

    init {
        getSavedStories()
    }

    private fun getSavedStories() {
        getSavedStories?.cancel()
        getSavedStories = storyRepository.getStories()
            .onEach { stories ->
                updateState(
                    uiState.value.copy(
                        stories = stories
                    )
                )
            }
            .launchIn(viewModelScope)
    }

    fun onEvent(event: SavedStoriesEvent) {
        when (event) {
            is SavedStoriesEvent.DeleteStory -> {
                viewModelScope.launch {
                    storyRepository.deleteStory(event.story)
                }
            }
        }
    }
}