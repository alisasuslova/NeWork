package ru.netology.nework.domain.job

class GetJobByIdUseCase(private val jobListRepository: JobListRepository) {

    fun getJobById(id: Int): Job {
       return jobListRepository.getJobById(id)
    }
}