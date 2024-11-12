package ru.netology.nework.domain.event

class GetEventByIdUseCase(private val eventListRepository: EventListRepository) {

    fun getEventById(id: Long): Event {
       return eventListRepository.getEventById(id)
    }
}