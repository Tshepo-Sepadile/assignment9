package ac.za.cput.service.impl;

import ac.za.cput.domain.Job;
import ac.za.cput.factory.JobFactory;
import ac.za.cput.repository.JobRepository;
import ac.za.cput.service.JobService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JobServiceImplTest {

    @Autowired
    private JobService service;

    @Test
    public void a_create() {

        Job job = JobFactory.getJob("Developer");
        job = service.create(job);
        Assert.assertEquals("Developer", job.myJobTitle());
    }

    @Test
    public void c_update() {

        String jobTitle = "Programmer";
        Job job = JobFactory.getJob(jobTitle);
        job = service.update(job);
        Assert.assertEquals("Programmer", job.myJobTitle());


    }

    @Test
    public void e_delete() {

        String myJob = "Progammer";
        service.delete(myJob);
        assertNull(service.read(myJob));
    }

    @Test
    public void b_read() {

        Job job = JobFactory.getJob("Developer");
        job = service.create(job);
        Assert.assertNotNull(job);
    }

    @Test
    public void d_getAll() {

        a_create(); //Comment the create method out when you run all tests at once
        List<Job> persons = this.service.getAll();
        Assert.assertEquals(1, persons.size());
    }
}