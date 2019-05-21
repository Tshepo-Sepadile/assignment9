package ac.za.cput.repository;
import ac.za.cput.domain.Job;

import java.util.Set;

public interface JobRepository extends IRepository<Job, String> {
    Set<Job> getAll();
}
