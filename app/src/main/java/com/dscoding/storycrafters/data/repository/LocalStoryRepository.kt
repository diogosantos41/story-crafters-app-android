package com.dscoding.storycrafters.data.repository

import com.dscoding.storycrafters.data.data_source.StoryDao
import com.dscoding.storycrafters.domain.model.Story
import com.dscoding.storycrafters.domain.repository.StoryRepository
import kotlinx.coroutines.flow.Flow

class LocalStoryRepository(
    private val dao: StoryDao
) : StoryRepository {
    override fun getStories(): Flow<List<Story>> {
        return dao.getStories()
    }

    override suspend fun getStoryById(id: Int): Story? {
        return dao.getStoryById(id)
    }

    override suspend fun addStory(story: Story) {
        dao.upsertStory(story)
    }

    override suspend fun deleteStory(story: Story) {
        dao.deleteStory(story)
    }

}