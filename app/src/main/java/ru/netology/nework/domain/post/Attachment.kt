package ru.netology.nework.domain.post

class Attachment(
    val url: String,
    val type : Enum<TypeAttachment>
)

enum class TypeAttachment{
IMAGE, VIDEO, AUDIO
}