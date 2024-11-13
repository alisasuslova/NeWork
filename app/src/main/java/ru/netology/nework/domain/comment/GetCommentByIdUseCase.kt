package ru.netology.nework.domain.comment

class GetCommentByIdUseCase(private val commentListRepository: CommentListRepository) {

    fun getCommentById(id: Int): Comment {
       return commentListRepository.getCommentById(id)
    }
}