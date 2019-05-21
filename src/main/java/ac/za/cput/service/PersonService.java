package ac.za.cput.service;

import ac.za.cput.domain.Person;

import java.util.Set;

public interface PersonService extends IService<Person, String> {

    Set<Person> getAll();
}
