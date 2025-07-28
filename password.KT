package com.example.passwordmanager

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Password(
    val site: String,
    val password: String,
    @PrimaryKey(autoGenerate = true) val id: Int = 0
)
