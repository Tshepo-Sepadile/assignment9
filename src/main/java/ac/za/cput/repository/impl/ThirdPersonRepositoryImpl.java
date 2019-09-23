package ac.za.cput.repository.impl;

import ac.za.cput.domain.ThirdPerson;
import ac.za.cput.repository.ThirdPersonRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("ThirdPersonInMemory")
public class ThirdPersonRepositoryImpl implements ThirdPersonRepository {

    private static ThirdPersonRepository repository = null;
    private static Set<ThirdPerson> persons;

    private ThirdPersonRepositoryImpl()
    {
        this.persons = new HashSet<>();
    }

    public static ThirdPersonRepository getRepository()
    {
        if(repository == null) repository = new ThirdPersonRepositoryImpl();
        return repository;
    }

    public ThirdPerson create(ThirdPerson person)
    {
        this.persons.add(person);
        return person;
    }

    public ThirdPerson read(final String personId)
    {
        ThirdPerson person = this.persons.stream().filter(e -> e.personId().equalsIgnoreCase(personId)).findAny().orElse(null);
        return person;
    }

    public ThirdPerson update(ThirdPerson person)
    {
        ThirdPerson personDelete = read(person.personId());
        if(personDelete != null)
        {
            this.persons.remove(personDelete);
            return create(person);
        }

        return person;
    }

    public void delete(String personId)
    {
        ThirdPerson person = read(personId);
        this.persons.remove(person);
    }

    public Set<ThirdPerson> getAll()
    {
        return this.persons;
    }
}
