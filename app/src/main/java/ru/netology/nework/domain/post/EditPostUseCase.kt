package ru.netology.nework.domain.post

class EditPostUseCase(private val postListRepository: PostListRepository) {

    fun editPost(post: Post) {
        postListRepository.editPost(post)
    }
}