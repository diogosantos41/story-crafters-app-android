package com.dscoding.storycrafters.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "story_table")
data class Story(
    val title: String,
    val description: String,
    val content: String,
    val category: String,
    val language: String,
    val ageGroup: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)

