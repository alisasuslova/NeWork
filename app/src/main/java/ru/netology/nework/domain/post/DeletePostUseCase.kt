package ru.netology.nework.domain.post

class DeletePostUseCase(private val postListRepository: PostListRepository) {

    fun deletePost(post: Post) {
        postListRepository.deletePost(post)
    }
}