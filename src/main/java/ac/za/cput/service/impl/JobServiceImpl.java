package ac.za.cput.service.impl;

import ac.za.cput.domain.Job;
import ac.za.cput.repository.JobRepository;
import ac.za.cput.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class JobServiceImpl implements JobService {

    private static JobService jobService = null;

    @Autowired
    private JobRepository jobRepository;

    private JobServiceImpl()
    {

    }

    public static JobService getJobService()
    {
        if(jobService == null) jobService = new JobServiceImpl();
        return jobService;
    }



    @Override
    public Job create(Job job)
    {
        return this.jobRepository.save(job);
    }

    @Override
    public Job update(Job job)
    {
        return this.jobRepository.save(job);
    }

    @Override
    public void delete(String j)
    {
        this.jobRepository.deleteById(j);
    }

    @Override
    public Job read(String p)
    {
        Optional<Job> optionalPerson = this.jobRepository.findById(p);
        return optionalPerson.orElse(null);
    }

    @Override
    public Job retrieveById(String jobTitle)
    {
        List<Job> jobs = getAll();
        for(Job job : jobs){
            if(job.myJobTitle().equalsIgnoreCase(jobTitle)) return job;
        }
        return null;
    }

    @Override
    public List<Job> getAll() {
        return this.jobRepository.findAll();
    }

}
