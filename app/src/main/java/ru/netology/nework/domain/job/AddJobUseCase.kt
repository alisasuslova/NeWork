package ru.netology.nework.domain.job

class AddJobUseCase(private val jobListRepository: JobListRepository) {

    fun addEvent(job: Job) {
        jobListRepository.addJob(job)
    }
}