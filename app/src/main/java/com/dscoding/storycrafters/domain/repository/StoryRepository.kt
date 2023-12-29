package com.dscoding.storycrafters.domain.repository

import com.dscoding.storycrafters.domain.model.Story
import kotlinx.coroutines.flow.Flow

interface StoryRepository {

    fun getStories(): Flow<List<Story>>

    suspend fun getStoryById(id: Int): Story?

    suspend fun addStory(story: Story)

    suspend fun deleteStory(story: Story)
}