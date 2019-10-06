package ac.za.cput.repository;
import ac.za.cput.domain.ThirdPersonPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ThirdPersonPasswordRepository extends JpaRepository<ThirdPersonPassword, String> {
    //Set<ThirdPersonPassword> getAll();
}
