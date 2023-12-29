package com.dscoding.storycrafters.presentation.screens.create_story

import androidx.lifecycle.viewModelScope
import com.dscoding.storycrafters.domain.model.Story
import com.dscoding.storycrafters.domain.repository.StoryRepository
import com.dscoding.storycrafters.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreateStoryViewModel @Inject constructor(private val storyRepository: StoryRepository) :
    BaseViewModel<CreateStoryState>() {
    override fun initialState(): CreateStoryState {
        return CreateStoryState()
    }

    private val eventChannel = Channel<UiEvent>()
    val eventChannelFlow = eventChannel.receiveAsFlow()

    fun onEvent(event: CreateStoryEvent) {
        when (event) {
            is CreateStoryEvent.AddStory -> {
                val title = uiState.value.title
                val content = uiState.value.content

                if (title.isBlank() || content.isBlank()) {
                    return
                }

                viewModelScope.launch {
                    storyRepository.addStory(
                        Story(
                            title = title,
                            description = "some random text",
                            content = content,
                            category = "Mystery",
                            language = "English",
                            ageGroup = "2-3 Years"
                        )
                    )
                    eventChannel.send(UiEvent.AddStory)
                }
            }

            is CreateStoryEvent.EnteredTitle -> {
                updateState(
                    uiState.value.copy(
                        title = event.value
                    )
                )
            }

            is CreateStoryEvent.EnteredContent -> {
                updateState(
                    uiState.value.copy(
                        content = event.value
                    )
                )
            }
        }
    }

    sealed interface UiEvent {
        data object AddStory : UiEvent
    }
}