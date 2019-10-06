package ac.za.cput.repository;
import ac.za.cput.domain.SecondPersonPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface SecondPersonPasswordRepository extends JpaRepository<SecondPersonPassword, String> {
    //Set<SecondPersonPassword> getAll();
}
