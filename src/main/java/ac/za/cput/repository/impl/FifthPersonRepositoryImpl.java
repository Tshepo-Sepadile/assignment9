package ac.za.cput.repository.impl;

import ac.za.cput.domain.FifthPerson;
import ac.za.cput.repository.FifthPersonRepository;

import java.util.HashSet;
import java.util.Set;

public class FifthPersonRepositoryImpl implements FifthPersonRepository {

    private static FifthPersonRepositoryImpl repository = null;
    private Set<FifthPerson> fifthPersons;

    private FifthPersonRepositoryImpl()
    {
        this.fifthPersons = new HashSet<>();
    }

    public static FifthPersonRepository getRepository()
    {
        if(repository == null) repository = new FifthPersonRepositoryImpl();
        return repository;
    }

    public FifthPerson create(FifthPerson fifthPerson)
    {
        this.fifthPersons.add(fifthPerson);
        return fifthPerson;
    }

    public FifthPerson read(String personId)
    {
        this.fifthPersons.contains(personId);
        return null;
    }

    public FifthPerson update(FifthPerson person)
    {
        if(fifthPersons == person){
            this.fifthPersons.add(person);
        }
        return person;
    }

    public void delete(String personId)
    {
        this.fifthPersons.remove(personId);
    }

    public Set<FifthPerson> getAll()
    {
        return this.fifthPersons;
    }
}
