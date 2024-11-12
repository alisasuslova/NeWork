package ru.netology.nework.domain.event

class AddEventUseCase(private val eventListRepository: EventListRepository) {

    fun addEvent(event: Event) {
        eventListRepository.addEvent(event)
    }
}