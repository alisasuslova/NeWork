package ru.netology.nework.data

import ru.netology.nework.domain.post.Post
import ru.netology.nework.domain.post.PostListRepository
import ru.netology.nework.domain.user.User
import ru.netology.nework.domain.user.UserListRepository

object UserListRepositoryImpl: UserListRepository {
    override fun addUser(user: User) {
        TODO("Not yet implemented")
    }

    override fun deleteUser(user: User) {
        TODO("Not yet implemented")
    }

    override fun editUser(user: User) {
        TODO("Not yet implemented")
    }

    override fun getUserById(id: Long): User {
        TODO("Not yet implemented")
    }

    override fun getUserList(): List<User> {
        TODO("Not yet implemented")
    }

}