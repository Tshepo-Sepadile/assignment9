package ac.za.cput.factory;

import ac.za.cput.domain.Job;

public class JobFactory {

    public static Job getJob(String jobTitle)
    {
        return new Job.Builder().jobTitle(jobTitle).build();
    }
}
