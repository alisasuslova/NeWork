package ru.netology.nework.domain.comment

class GetCommentListUseCase(private val commentListRepository: CommentListRepository) {

    fun getCommentList() : List<Comment> {
        return commentListRepository.getCommentList()
    }

}