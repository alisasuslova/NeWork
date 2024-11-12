package ru.netology.nework.domain.event

import ru.netology.nework.domain.post.Attachment
import ru.netology.nework.domain.user.User

data class Event(
    val id: Long,
    val authorAvatar: String,
    val author: String,
    val content: String,
    val published: String,
    val typeEvent: TypeEvent = TypeEvent.ONLINE,
    val dateOfEvent: String,
    val likes: Int = 0,
    val sharesByMe: Boolean = false,
    val shares: Int = 0,
    val attachment: Attachment? = null,

    val lastJob: String = "В поиске работы",
    val participants: List<User> = listOf(),
    val speakers: List<User> = listOf(),
)
