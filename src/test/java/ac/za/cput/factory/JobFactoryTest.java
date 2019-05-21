package ac.za.cput.factory;

import ac.za.cput.domain.Job;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobFactoryTest {

    @Test
    public void getJob() {
        Job job  = JobFactory.getJob("Developer");
        Assert.assertNotNull(job.myJobTitle());
    }
}