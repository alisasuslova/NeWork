package ru.netology.nework.domain.job

class GetJobListUseCase(private val jobListRepository: JobListRepository) {

    fun getJobList() : List<Job> {
        return jobListRepository.getJobList()
    }

}