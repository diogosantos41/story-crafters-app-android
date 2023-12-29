package com.dscoding.storycrafters.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.dscoding.storycrafters.domain.model.Story
import kotlinx.coroutines.flow.Flow

@Dao
interface StoryDao {

    @Query("SELECT * FROM story_table")
    fun getStories(): Flow<List<Story>>

    @Query("SELECT * FROM story_table WHERE id = :id")
    suspend fun getStoryById(id: Int): Story?

    @Upsert
    suspend fun upsertStory(story: Story)

    @Delete
    suspend fun deleteStory(story: Story)


}