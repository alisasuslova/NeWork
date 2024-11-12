package ru.netology.nework.domain.event

class EditEventUseCase(private val eventListRepository: EventListRepository) {

    fun editEvent(event: Event) {
        eventListRepository.editEvent(event)
    }
}