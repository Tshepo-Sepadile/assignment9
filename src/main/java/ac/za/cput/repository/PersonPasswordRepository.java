package ac.za.cput.repository;
import ac.za.cput.domain.PersonPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PersonPasswordRepository extends JpaRepository<PersonPassword, String> {
    //Set<PersonPassword> getAll();
}
