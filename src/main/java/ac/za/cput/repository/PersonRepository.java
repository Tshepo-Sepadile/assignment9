package ac.za.cput.repository;
import ac.za.cput.domain.Person;

import java.util.Set;

public interface PersonRepository extends IRepository <Person, String> {

    Set<Person>getAll();


}
