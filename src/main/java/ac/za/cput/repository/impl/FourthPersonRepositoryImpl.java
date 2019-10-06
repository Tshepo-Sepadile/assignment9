/*package ac.za.cput.repository.impl;

import ac.za.cput.domain.FourthPerson;
import ac.za.cput.repository.FourthPersonRepository;

import java.util.HashSet;
import java.util.Set;

public class FourthPersonRepositoryImpl implements FourthPersonRepository {

    private static FourthPersonRepository repository = null;
    private static Set<FourthPerson> persons;

    private FourthPersonRepositoryImpl()
    {
        this.persons = new HashSet<>();
    }

    public static FourthPersonRepository getRepository()
    {
        if(repository == null) repository = new FourthPersonRepositoryImpl();
        return repository;
    }

    public FourthPerson create(FourthPerson person)
    {
        this.persons.add(person);
        return person;
    }

    public FourthPerson read(final String personId)
    {
        FourthPerson person = this.persons.stream().filter(e -> e.personId().equalsIgnoreCase(personId)).findAny().orElse(null);
        return person;
    }

    public FourthPerson update(FourthPerson person)
    {
        FourthPerson personDelete = read(person.personId());
        if(personDelete != null)
        {
            this.persons.remove(personDelete);
            return create(person);
        }

        return person;
    }

    public void delete(String personId)
    {
        FourthPerson person = read(personId);
        this.persons.remove(person);
    }

    public Set<FourthPerson> getAll()
    {
        return this.persons;
    }
}*/
