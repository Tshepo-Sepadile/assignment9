/*package ac.za.cput.repository.impl;

import ac.za.cput.domain.SecondPerson;
import ac.za.cput.repository.SecondPersonRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("SecondPersonInMemory")
public class SecondPersonRepositoryImpl implements SecondPersonRepository {

    private static SecondPersonRepository repository = null;
    private static Set<SecondPerson> persons;

    private SecondPersonRepositoryImpl()
    {
        this.persons = new HashSet<>();
    }

    public static SecondPersonRepository getRepository()
    {
        if(repository == null) repository = new SecondPersonRepositoryImpl();
        return repository;
    }

    public SecondPerson create(SecondPerson person)
    {
        this.persons.add(person);
        return person;
    }

    @Override
    public SecondPerson read(final String personId)
    {
        SecondPerson person = this.persons.stream().filter(e -> e.personId().equalsIgnoreCase(personId)).findAny().orElse(null);
        return person;
    }

    public SecondPerson update(SecondPerson person)
    {
        SecondPerson personDelete = read(person.personId());
        if(personDelete != null)
        {
            this.persons.remove(personDelete);
            return create(person);
        }

        return person;
    }

    public void delete(String personId)
    {
        SecondPerson person = read(personId);
        this.persons.remove(person);
    }

    public Set<SecondPerson> getAll()
    {
        return this.persons;
    }
}*/
