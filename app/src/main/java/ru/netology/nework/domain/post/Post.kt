package ru.netology.nework.domain.post

data class Post(
    val id: Long,
    val authorAvatar: String,
    val author: String, //User.name
    val content: String,
    val published: String,
    val likes: Int = 0,
    val sharesByMe: Boolean = false,
    val shares: Int = 0,
    val attachment: Attachment? = null
)
