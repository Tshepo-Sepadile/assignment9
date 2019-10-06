package ac.za.cput.repository;
import ac.za.cput.domain.ThirdPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface ThirdPersonRepository extends JpaRepository <ThirdPerson, String> {

    //Set<ThirdPerson>getAll();


}
