package com.example.displaygu.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
    val name: String,
    @field:Json(name = "avatar_url") val avatarUrl: String
){
}