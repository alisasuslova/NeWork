package ru.netology.nework.domain.event

class GetEventByIdUseCase(private val eventListRepository: EventListRepository) {

    fun getEventById(id: Int): Event {
       return eventListRepository.getEventById(id)
    }
}