package ru.netology.nework.domain.job

class DeleteJobUseCase(private val jobListRepository: JobListRepository) {

    fun deleteEvent(job: Job) {
        jobListRepository.deleteJob(job)
    }
}