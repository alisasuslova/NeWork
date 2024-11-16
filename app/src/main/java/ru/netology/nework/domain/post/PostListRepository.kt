package ru.netology.nework.domain.post

import androidx.lifecycle.LiveData

interface PostListRepository {

    fun addPost(post: Post)
    fun deletePost(post: Post)
    fun editPost(post: Post)
    fun getPostById(id: Int): Post
    fun getPostList() : LiveData<List<Post>>

    //методы на лайки и поделиться + счетчики
}