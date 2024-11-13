package ru.netology.nework.domain.comment

class DeleteCommentUseCase(private val commentListRepository: CommentListRepository) {

    fun deleteEvent(comment: Comment) {
        commentListRepository.deleteComment(comment)
    }
}