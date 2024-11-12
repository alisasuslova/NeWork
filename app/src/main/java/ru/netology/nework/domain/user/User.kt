package ru.netology.nework.domain.user

import ru.netology.nework.domain.job.Job
import ru.netology.nework.domain.post.Post

data class User(
    val id: Long,
    val name: String,
    val authorization: Boolean = false,
    val login: String,
    val password: String,
    val wall: List<Post> = listOf(),
    val jobs: List<Job> = listOf(),
)
