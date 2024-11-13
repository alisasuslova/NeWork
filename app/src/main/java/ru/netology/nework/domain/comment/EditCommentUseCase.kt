package ru.netology.nework.domain.comment

class EditCommentUseCase(private val commentListRepository: CommentListRepository) {

    fun editEvent(comment: Comment) {
        commentListRepository.editComment(comment)
    }
}