package ru.netology.nework.domain.post

import androidx.lifecycle.LiveData

class GetPostListUseCase(private val postListRepository: PostListRepository) {

    fun getPostList() : LiveData<List<Post>> {
        return postListRepository.getPostList()
    }

}