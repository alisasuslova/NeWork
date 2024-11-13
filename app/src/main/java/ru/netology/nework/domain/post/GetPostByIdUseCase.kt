package ru.netology.nework.domain.post

class GetPostByIdUseCase(private val postListRepository: PostListRepository) {

    fun getPostById(id: Int): Post {
        return postListRepository.getPostById(id)
    }
}