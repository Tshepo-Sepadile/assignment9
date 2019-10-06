package ac.za.cput.service.impl;

import ac.za.cput.domain.FourthPerson;
import ac.za.cput.repository.FourthPersonRepository;
import ac.za.cput.service.FourthPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class FourthPersonServiceImpl implements FourthPersonService {

    private static FourthPersonService fourthPersonService = null;

    @Autowired
    private FourthPersonRepository fourthPersonRepository;

    private FourthPersonServiceImpl()
    {

    }

    public static FourthPersonService getFourthPersonService()
    {
        if(fourthPersonService == null) fourthPersonService = new FourthPersonServiceImpl();
        return fourthPersonService;
    }



    @Override
    public FourthPerson create(FourthPerson person)
    {
        return this.fourthPersonRepository.save(person);
    }

    @Override
    public FourthPerson update(FourthPerson person)
    {
        return this.fourthPersonRepository.save(person);
    }

    @Override
    public void delete(String p)
    {
        this.fourthPersonRepository.deleteById(p);
    }

    @Override
    public FourthPerson read(String p)
    {
        Optional<FourthPerson> optionalPerson = this.fourthPersonRepository.findById(p);
        return optionalPerson.orElse(null);
    }

    @Override
    public FourthPerson retrieveById(String personId)
    {
        List<FourthPerson> fourthPeople = getAll();
        for(FourthPerson fourthPerson : fourthPeople){
            if(fourthPerson.personId().equalsIgnoreCase(personId)) return fourthPerson;
        }
        return null;
    }

    @Override
    public List<FourthPerson> getAll() {
        return this.fourthPersonRepository.findAll();
    }


}
