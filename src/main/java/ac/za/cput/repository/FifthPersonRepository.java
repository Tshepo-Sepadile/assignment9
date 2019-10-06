package ac.za.cput.repository;
import ac.za.cput.domain.FifthPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface FifthPersonRepository extends JpaRepository <FifthPerson, String> {

    //Set<FifthPerson>getAll();


}
