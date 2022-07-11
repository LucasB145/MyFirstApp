package com.example.racontemoiunehistoire

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Story(
    val personnage: String,
    val lieu: String
):Parcelable
