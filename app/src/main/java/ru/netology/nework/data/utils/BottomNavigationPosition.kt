/*
package ru.netology.nework.presentation.utils

import androidx.fragment.app.Fragment
import ru.netology.nework.R
import ru.netology.nework.presentation.EventsFragment
import ru.netology.nework.presentation.PostsFragment
import ru.netology.nework.presentation.UsersFragment

enum class BottomNavigationPosition(val position: Int, val id: Int) {
    FIRST(0, R.id.postsFragment),
    SECOND(1, R.id.eventsFragment),
    THIRD(2, R.id.usersFragment)

}

fun findNavigationPositionById(id: Int): BottomNavigationPosition = when (id) {
    BottomNavigationPosition.FIRST.id -> BottomNavigationPosition.FIRST
    BottomNavigationPosition.SECOND.id -> BottomNavigationPosition.SECOND
    BottomNavigationPosition.THIRD.id -> BottomNavigationPosition.THIRD
    else -> BottomNavigationPosition.FIRST
}

fun BottomNavigationPosition.createFragment(): Fragment = when (this) {
    BottomNavigationPosition.FIRST -> PostsFragment.newInstancePost()
    BottomNavigationPosition.SECOND -> EventsFragment.newInstanceEvent()
    BottomNavigationPosition.THIRD -> UsersFragment.newInstanceUser()
}

fun BottomNavigationPosition.getTag(): String = when (this) {
    BottomNavigationPosition.FIRST -> PostsFragment.TAG
    BottomNavigationPosition.SECOND -> EventsFragment.TAG
    BottomNavigationPosition.THIRD -> UsersFragment.TAG
}*/
