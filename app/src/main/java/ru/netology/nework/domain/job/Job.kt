package ru.netology.nework.domain.job

data class Job(
    val id: Int,
    val name: String,
    val position: String,
    val start: String, //($date-time)
    val finish: String = "НВ",
    val link: String
)