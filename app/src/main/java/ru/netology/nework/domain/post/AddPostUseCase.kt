package ru.netology.nework.domain.post

class AddPostUseCase(private val postListRepository: PostListRepository) {

    fun addPost(post: Post) {
        postListRepository.addPost(post)
    }
}