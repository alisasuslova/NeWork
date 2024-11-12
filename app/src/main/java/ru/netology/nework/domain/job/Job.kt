package ru.netology.nework.domain.job

data class Job(
    val id: Long,
    val name: String,
    val dateStart: String, //мб дата!
    val dateEnd: String = "НВ",
    val profession: String,
    val url: String
)
