package ac.za.cput.repository.impl;

import ac.za.cput.domain.Occupation;
import ac.za.cput.repository.OccupationRepository;

import java.util.HashSet;
import java.util.Set;

public class OccupationRepositoryImpl implements OccupationRepository{

    private static OccupationRepositoryImpl repository = new OccupationRepositoryImpl();
    private Set<Occupation> occupations;
    //private SecondPerson secondPersons;

    private OccupationRepositoryImpl()
    {
        this.occupations = new HashSet<>();
    }

    public static OccupationRepository getRepository()
    {
        if(repository == null) repository = new OccupationRepositoryImpl();
        return repository;
    }

    public Occupation create(Occupation occupation)
    {
        this.occupations.add(occupation);
        return occupation;
    }

    public Occupation read(String occupationID)
    {
        this.occupations.contains(occupationID);
        return null;
    }

    public Occupation update(Occupation occupation)
    {
        if(occupations == occupation){
            this.occupations.add(occupation);
        }
        return occupation;
    }

    public void delete(String pass)
    {
        this.occupations.remove(pass);
    }


    public Set<Occupation> getAll()
    {
        return this.occupations;
    }
}
