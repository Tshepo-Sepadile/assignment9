package ac.za.cput.repository.impl;

import ac.za.cput.domain.Person;
import ac.za.cput.repository.PersonRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("PersonInMemory")
public class PersonRepositoryImpl implements PersonRepository {

    private static PersonRepositoryImpl repository = null;
    private static Set<Person> persons;

    private PersonRepositoryImpl()
    {
        this.persons = new HashSet<>();
    }

    public static PersonRepositoryImpl getRepository()
    {
        if(repository == null) repository = new PersonRepositoryImpl();
        return repository;
    }

    public Person create(Person person)
    {
        this.persons.add(person);
        return person;
    }

    public Person read(final String personId)
    {
        Person person = this.persons.stream().filter(e -> e.personId().equalsIgnoreCase(personId)).findAny().orElse(null);
        return person;
    }

    public Person update(Person person)
    {
        Person personDelete = read(person.personId());
        if(personDelete != null)
        {
            this.persons.remove(personDelete);
            return create(person);
        }

        return person;
    }

    public void delete(String personId)
    {
        Person person = read(personId);
        this.persons.remove(person);
    }

    public Set<Person> getAll()
    {
        return this.persons;
    }
}
