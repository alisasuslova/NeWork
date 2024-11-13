package ru.netology.nework.domain.comment

data class Comment(
    val id: Int,
    val postId: Int,
    val authorId: Int,
    val author: String,
    val authorAvatar: String,
    val content: String,
    val published: String, //($date-time)
    val likeOwnerIds: ArrayList<Int>,
    val likedByMe: Boolean
)
