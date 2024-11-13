package ru.netology.nework.domain.comment

interface CommentListRepository {

    fun addComment(comment: Comment)
    fun deleteComment(comment: Comment)
    fun editComment(comment: Comment)
    fun getCommentById(id: Int): Comment
    fun getCommentList() : List<Comment>

    //методы на лайки и поделиться + счетчики
}