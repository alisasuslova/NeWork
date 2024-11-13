package ru.netology.nework.domain.user

data class UserResponse(
    val id: Int,
    val login: String,
    val name: String,
    val avatar:String
)
