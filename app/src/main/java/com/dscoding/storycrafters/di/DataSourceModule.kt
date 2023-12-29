package com.dscoding.storycrafters.di

import android.app.Application
import androidx.room.Room
import com.dscoding.storycrafters.data.data_source.StoryDatabase
import com.dscoding.storycrafters.data.repository.LocalStoryRepository
import com.dscoding.storycrafters.domain.repository.StoryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    @Singleton
    fun provideStoryDatabase(app: Application): StoryDatabase {
        return Room.databaseBuilder(app, StoryDatabase::class.java, "story_db")
            .build()
    }

    @Provides
    @Singleton
    fun provideStoryRepository(db: StoryDatabase): StoryRepository {
        return LocalStoryRepository(db.storyDao)
    }
}