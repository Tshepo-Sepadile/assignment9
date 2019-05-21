package ac.za.cput.repository.impl;

import ac.za.cput.domain.Job;
import ac.za.cput.repository.JobRepository;

import java.util.HashSet;
import java.util.Set;

public class JobRepositoryImpl implements JobRepository {

    private static JobRepositoryImpl repository = null;
    private Set<Job> jobs;

    private JobRepositoryImpl()
    {
        this.jobs = new HashSet<>();
    }

    public static JobRepository getRepository()
    {
        if(repository == null) repository = new JobRepositoryImpl();
        return repository;
    }

    public Job create(Job job)
    {
        this.jobs.add(job);
        return job;
    }

    public Job read(String jobTitle)
    {
        this.jobs.contains(jobTitle);
        return null;
    }

    public Job update(Job job)
    {
        if(jobs == job){
            this.jobs.add(job);
        }
        return job;
    }
    public void delete(String jobTitle)
    {
        this.jobs.remove(jobTitle);
    }


    public Set<Job> getAll()
    {
        return this.jobs;
    }
}
