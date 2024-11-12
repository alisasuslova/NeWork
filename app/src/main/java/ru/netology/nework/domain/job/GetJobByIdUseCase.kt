package ru.netology.nework.domain.job

class GetJobByIdUseCase(private val jobListRepository: JobListRepository) {

    fun getJobById(id: Long): Job {
       return jobListRepository.getJobById(id)
    }
}