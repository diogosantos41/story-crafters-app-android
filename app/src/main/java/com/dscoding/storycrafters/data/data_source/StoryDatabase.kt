package com.dscoding.storycrafters.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dscoding.storycrafters.domain.model.Story

@Database(entities = [Story::class], version = 1)

abstract class StoryDatabase : RoomDatabase() {
    abstract val storyDao: StoryDao
}