package ac.za.cput.service;

import ac.za.cput.domain.Job;

import java.util.List;
import java.util.Set;

public interface JobService extends IService<Job, String> {

    Job retrieveById(String personId);
    List<Job> getAll();
}
