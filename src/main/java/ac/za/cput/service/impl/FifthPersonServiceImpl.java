package ac.za.cput.service.impl;

import ac.za.cput.domain.FifthPerson;
import ac.za.cput.repository.FifthPersonRepository;
import ac.za.cput.service.FifthPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class FifthPersonServiceImpl implements FifthPersonService {

    private static FifthPersonService fifthPersonService = null;

    @Autowired
    private FifthPersonRepository fifthPersonRepository;

    private FifthPersonServiceImpl()
    {

    }

    public static FifthPersonService getFifthPersonService()
    {
        if(fifthPersonService == null) fifthPersonService = new FifthPersonServiceImpl();
        return fifthPersonService;
    }



    @Override
    public FifthPerson create(FifthPerson person)
    {
        return this.fifthPersonRepository.save(person);
    }

    @Override
    public FifthPerson update(FifthPerson person)
    {
        return this.fifthPersonRepository.save(person);
    }

    @Override
    public void delete(String p)
    {
        this.fifthPersonRepository.deleteById(p);
    }

    @Override
    public FifthPerson read(String p)
    {
        Optional<FifthPerson> optionalPerson = this.fifthPersonRepository.findById(p);
        return optionalPerson.orElse(null);
    }

    @Override
    public FifthPerson retrieveById(String personId)
    {
        List<FifthPerson> fifthPeople = getAll();
        for(FifthPerson fifthPerson : fifthPeople){
            if(fifthPerson.personId().equalsIgnoreCase(personId)) return fifthPerson;
        }
        return null;
    }

    @Override
    public List<FifthPerson> getAll() {
        return this.fifthPersonRepository.findAll();
    }


}
