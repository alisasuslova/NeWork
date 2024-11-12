package ru.netology.nework.domain.post

class GetPostListUseCase(private val postListRepository: PostListRepository) {

    fun getPostList() : List<Post> {
        return postListRepository.getPostList()
    }

}