package ru.netology.nework.domain.job

interface JobListRepository {
    fun addJob(job: Job)
    fun deleteJob(job: Job)
    fun editJob(job: Job)
    fun getJobById(id: Long): Job
    fun getJobList() : List<Job>
}