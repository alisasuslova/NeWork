package ru.netology.nework.ui

import androidx.lifecycle.ViewModel
import ru.netology.nework.data.repository.EventListRepositoryImpl
import ru.netology.nework.data.repository.PostListRepositoryImpl
import ru.netology.nework.data.repository.UserListRepositoryImpl
import ru.netology.nework.domain.event.GetEventListUseCase
import ru.netology.nework.domain.post.GetPostListUseCase
import ru.netology.nework.domain.user.GetUserListUseCase

class MainViewModel: ViewModel() {

    //позже убрать
    private val postListRepository = PostListRepositoryImpl
    private val eventListRepository = EventListRepositoryImpl
    private val userListRepository = UserListRepositoryImpl

    //получить 3 списка посты, события, пользователи:
    private val getPostListUseCase = GetPostListUseCase(postListRepository)
    private val getEventListUseCase = GetEventListUseCase(eventListRepository)
    private val getUserListRepository = GetUserListUseCase(userListRepository)

    //если пользователь авторизован, есть доступ к экранам создания/редактирования поста/события

    //создание объекта LD
    val postList = getPostListUseCase.getPostList()



}

