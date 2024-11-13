package ru.netology.nework.domain.post

import ru.netology.nework.domain.user.UserPreview

data class Post(
    val id: Int,
    val authorId: Int,
    val authorAvatar: String,
    val authorJob: String,
    val author: String, //User.name
    val content: String,
    val published: String,
    val coords: Coordinates,
    val link: String,
    val mentionIds: ArrayList<Int>,
    val mentionedMe: Boolean,
    val likes: Int = 0,
    val likeOwnerIds: ArrayList<Int>,
    val likedByMe: Boolean,
    val attachment: Attachment? = null,
    val users: UserPreview,

    val sharesByMe: Boolean = false,
    val shares: Int = 0,

    )
