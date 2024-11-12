package ru.netology.nework.domain.event

class GetEventListUseCase(private val eventListRepository: EventListRepository) {

    fun getEventList() : List<Event> {
        return eventListRepository.getEventList()
    }

}