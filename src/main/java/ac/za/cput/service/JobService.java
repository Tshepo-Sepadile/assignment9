package ac.za.cput.service;

import ac.za.cput.domain.Job;

import java.util.Set;

public interface JobService extends IService<Job, String> {

    Set<Job> getAll();
}
