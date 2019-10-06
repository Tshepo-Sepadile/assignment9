package ac.za.cput.repository;
import ac.za.cput.domain.FourthPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface FourthPersonRepository extends JpaRepository <FourthPerson, String> {

    //Set<FourthPerson>getAll();


}
