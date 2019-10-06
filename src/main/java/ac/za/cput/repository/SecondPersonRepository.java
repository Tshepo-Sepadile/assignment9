package ac.za.cput.repository;
import ac.za.cput.domain.SecondPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface SecondPersonRepository extends JpaRepository <SecondPerson, String> {

    //Set<SecondPerson>getAll();


}
