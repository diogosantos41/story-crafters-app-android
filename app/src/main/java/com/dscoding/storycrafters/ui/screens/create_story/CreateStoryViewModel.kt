package com.dscoding.storycrafters.ui.screens.create_story

import com.dscoding.storycrafters.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class CreateStoryViewModel() : BaseViewModel<CreateStoryState>() {
    override fun initialState(): CreateStoryState {
        return CreateStoryState()
    }

}