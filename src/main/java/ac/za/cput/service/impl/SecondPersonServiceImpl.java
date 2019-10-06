package ac.za.cput.service.impl;

import ac.za.cput.domain.SecondPerson;
import ac.za.cput.repository.SecondPersonRepository;
import ac.za.cput.service.SecondPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class SecondPersonServiceImpl implements SecondPersonService {

    private static SecondPersonService secondPersonService = null;

    @Autowired
    private SecondPersonRepository secondPersonRepository;

    private SecondPersonServiceImpl()
    {

    }

    public static SecondPersonService getSecondPersonService()
    {
        if(secondPersonService == null) secondPersonService = new SecondPersonServiceImpl();
        return secondPersonService;
    }



    @Override
    public SecondPerson create(SecondPerson person)
    {
        return this.secondPersonRepository.save(person);
    }

    @Override
    public SecondPerson update(SecondPerson person)
    {
        return this.secondPersonRepository.save(person);
    }

    @Override
    public void delete(String p)
    {
        this.secondPersonRepository.deleteById(p);
    }

    @Override
    public SecondPerson read(String p)
    {
        Optional<SecondPerson> optionalPerson = this.secondPersonRepository.findById(p);
        return optionalPerson.orElse(null);
    }

    @Override
    public SecondPerson retrieveById(String personId)
    {
        List<SecondPerson> secondPeople = getAll();
        for(SecondPerson secondPerson : secondPeople){
            if(secondPerson.personId().equalsIgnoreCase(personId)) return secondPerson;
        }
        return null;
    }

    @Override
    public List<SecondPerson> getAll() {
        return this.secondPersonRepository.findAll();
    }

}
