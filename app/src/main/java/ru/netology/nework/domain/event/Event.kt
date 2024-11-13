package ru.netology.nework.domain.event

import ru.netology.nework.domain.post.Attachment
import ru.netology.nework.domain.post.Coordinates
import ru.netology.nework.domain.user.UserPreview

data class Event(
    val id: Int,
    val authorId: Int,
    val author: String,
    val authorJob:String,
    val authorAvatar:String,
    val content: String,
    val datetime: String, //($date-time)
    val published: String, //($date-time)
    val coords: Coordinates,
    val typeEvent: TypeEvent = TypeEvent.ONLINE,
    val likeOwnerIds: ArrayList<Int>,
    val likedByMe: Boolean,

    val speakerIds: ArrayList<Int>,
    val participantsIds: ArrayList<Int>,
    val participatedByMe: Boolean,
    val attachment: Attachment,

    val link: String,
    val users: UserPreview,


    /* val likes: Int = 0,
     val sharesByMe: Boolean = false,
     val shares: Int = 0,*/

)
