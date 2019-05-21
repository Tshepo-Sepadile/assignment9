package ac.za.cput.repository;
import ac.za.cput.domain.SecondPerson;

import java.util.Set;

public interface SecondPersonRepository extends IRepository <SecondPerson, String> {

    Set<SecondPerson>getAll();


}
