package ac.za.cput.repository;
import ac.za.cput.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface JobRepository extends JpaRepository<Job, String> {
    //Set<Job> getAll();
}
