package ru.netology.nework.domain.post

interface PostListRepository {

    fun addPost(post: Post)
    fun deletePost(post: Post)
    fun editPost(post: Post)
    fun getPostById(id: Int): Post
    fun getPostList() : List<Post>

    //методы на лайки и поделиться + счетчики
}