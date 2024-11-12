package ru.netology.nework.domain.event

interface EventListRepository {

    fun addEvent(event: Event)
    fun deleteEvent(event: Event)
    fun editEvent(event: Event)
    fun getEventById(id: Long): Event
    fun getEventList() : List<Event>

    //методы на лайки и поделиться + счетчики
}