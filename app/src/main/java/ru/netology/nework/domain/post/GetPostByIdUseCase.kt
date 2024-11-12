package ru.netology.nework.domain.post

class GetPostByIdUseCase(private val postListRepository: PostListRepository) {

    fun getPostById(id: Long): Post {
        return postListRepository.getPostById(id)
    }
}