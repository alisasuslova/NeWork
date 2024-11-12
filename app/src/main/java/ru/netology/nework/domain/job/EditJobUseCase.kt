package ru.netology.nework.domain.job

class EditJobUseCase(private val jobListRepository: JobListRepository) {

    fun editEvent(job: Job) {
        jobListRepository.editJob(job)
    }
}