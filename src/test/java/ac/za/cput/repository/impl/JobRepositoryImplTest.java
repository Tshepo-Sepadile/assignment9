package ac.za.cput.repository.impl;

import ac.za.cput.domain.Job;
import ac.za.cput.factory.JobFactory;
import ac.za.cput.repository.JobRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class JobRepositoryImplTest {

    private JobRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = JobRepositoryImpl.getRepository();
    }


    @Test
    public void create() {
        Job job = JobFactory.getJob("Web Developer");
        repository.create(job);
        Assert.assertEquals(1, repository.getAll().size());
    }

    @Test
    public void read() {
        Job job = JobFactory.getJob("Web Developer");
        job = repository.create(job);
        Assert.assertNotNull(job);

    }

    @Test
    public void update() {
        String jobTitle = "Software Developer";
        Job job = JobFactory.getJob(jobTitle);
        job = repository.update(job);
        Assert.assertEquals("Software Developer", job.myJobTitle());
    }

    @Test
    public void delete() {
        String jobTitle = "Web Developer";
        repository.delete(jobTitle);
        assertNull(repository.read(jobTitle));
    }

    @Test
    public void getAll() {
        //create(); //Comment the create method out when you run all tests at once
        Set<Job> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}