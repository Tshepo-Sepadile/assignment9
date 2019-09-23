package ac.za.cput.repository.impl;

import ac.za.cput.domain.FifthPerson;
import ac.za.cput.repository.FifthPersonRepository;

import java.util.HashSet;
import java.util.Set;

public class FifthPersonRepositoryImpl implements FifthPersonRepository {

    private static FifthPersonRepository repository = null;
    private static Set<FifthPerson> persons;

    private FifthPersonRepositoryImpl()
    {
        this.persons = new HashSet<>();
    }

    public static FifthPersonRepository getRepository()
    {
        if(repository == null) repository = new FifthPersonRepositoryImpl();
        return repository;
    }

    public FifthPerson create(FifthPerson person)
    {
        this.persons.add(person);
        return person;
    }

    public FifthPerson read(final String personId)
    {
        FifthPerson person = this.persons.stream().filter(e -> e.personId().equalsIgnoreCase(personId)).findAny().orElse(null);
        return person;
    }

    public FifthPerson update(FifthPerson person)
    {
        FifthPerson personDelete = read(person.personId());
        if(personDelete != null)
        {
            this.persons.remove(personDelete);
            return create(person);
        }

        return person;
    }

    public void delete(String personId)
    {
        FifthPerson person = read(personId);
        this.persons.remove(person);
    }

    public Set<FifthPerson> getAll()
    {
        return this.persons;
    }
}
