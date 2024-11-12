package ru.netology.nework.domain.event

class DeleteEventUseCase(private val eventListRepository: EventListRepository) {

    fun deleteEvent(event: Event) {
        eventListRepository.deleteEvent(event)
    }
}