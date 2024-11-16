package ru.netology.nework.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.nework.domain.post.Coordinates
import ru.netology.nework.domain.post.Post
import ru.netology.nework.domain.post.PostListRepository
import ru.netology.nework.domain.user.UserPreview

object PostListRepositoryImpl: PostListRepository {

    private val postListLD = MutableLiveData<List<Post>>()
    private val postList = mutableListOf<Post>()

    private var autoIncrementId = 0

    init {
        val post0 = Post(0,
            0,
            "qwrerwr",
            "TestJob",
            "Name",
            "content",
            "published",
            Coordinates(45.52, 42.52),
            "esgfdhgf",
            mentionIds = mutableListOf<Int>(),
            false,
            0,
            likeOwnerIds =  mutableListOf<Int>(),
            false,
            null,
            UserPreview("Name", "avatar"),

        )
        postList.add(post0)
    }


    override fun addPost(post: Post) {
        postList.add(post)
        autoIncrementId++
        updateList()
    }

    override fun deletePost(post: Post) {
        postList.remove(post)
        updateList()
    }

    override fun editPost(post: Post) {
        val oldPost = getPostById(post.id)
        postList.remove(oldPost)
        postList.add(post)
    }

    override fun getPostById(id: Int): Post {
        return postList.find {
            it.id == id
        } ?:throw RuntimeException("Пост не найден")
    }

    override fun getPostList(): LiveData<List<Post>> {
        return postListLD
    }

    //метод для обновение объекта
    private fun updateList() {
        postListLD.value = postList.toList()
    }
}