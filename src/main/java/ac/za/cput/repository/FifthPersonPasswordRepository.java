package ac.za.cput.repository;
import ac.za.cput.domain.FifthPersonPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface FifthPersonPasswordRepository extends JpaRepository<FifthPersonPassword, String> {
    //Set<FifthPersonPassword> getAll();
}
