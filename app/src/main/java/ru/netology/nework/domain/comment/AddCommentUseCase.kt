package ru.netology.nework.domain.comment

class AddCommentUseCase(private val commentListRepository: CommentListRepository) {

    fun addEvent(comment: Comment) {
        commentListRepository.addComment(comment)
    }
}