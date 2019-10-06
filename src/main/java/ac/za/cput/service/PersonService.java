package ac.za.cput.service;

import ac.za.cput.domain.Person;

import java.util.List;
import java.util.Set;

public interface PersonService extends IService<Person, String> {

    Person retrieveById(String personId);
    List<Person> getAll();
}
