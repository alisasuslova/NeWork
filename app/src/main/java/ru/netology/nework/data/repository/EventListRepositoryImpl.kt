package ru.netology.nework.data.repository

import ru.netology.nework.domain.event.Event
import ru.netology.nework.domain.event.EventListRepository

object EventListRepositoryImpl: EventListRepository {
    override fun addEvent(event: Event) {
        TODO("Not yet implemented")
    }

    override fun deleteEvent(event: Event) {
        TODO("Not yet implemented")
    }

    override fun editEvent(event: Event) {
        TODO("Not yet implemented")
    }

    override fun getEventById(id: Int): Event {
        TODO("Not yet implemented")
    }

    override fun getEventList(): List<Event> {
        TODO("Not yet implemented")
    }
}