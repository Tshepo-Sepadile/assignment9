package ac.za.cput.service.impl;

import ac.za.cput.domain.ThirdPerson;
import ac.za.cput.repository.ThirdPersonRepository;
import ac.za.cput.service.ThirdPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ThirdPersonServiceImpl implements ThirdPersonService {

    private static ThirdPersonService thirdPersonService = null;

    @Autowired
    private ThirdPersonRepository thirdPersonRepository;

    private ThirdPersonServiceImpl()
    {

    }

    public static ThirdPersonService getThirdPersonService()
    {
        if(thirdPersonService == null) thirdPersonService = new ThirdPersonServiceImpl();
        return thirdPersonService;
    }



    @Override
    public ThirdPerson create(ThirdPerson person)
    {
        return this.thirdPersonRepository.save(person);
    }

    @Override
    public ThirdPerson update(ThirdPerson person)
    {
        return this.thirdPersonRepository.save(person);
    }

    @Override
    public void delete(String p)
    {
        this.thirdPersonRepository.deleteById(p);
    }

    @Override
    public ThirdPerson read(String p)
    {
        Optional<ThirdPerson> optionalPerson = this.thirdPersonRepository.findById(p);
        return optionalPerson.orElse(null);
    }

    @Override
    public ThirdPerson retrieveById(String personId)
    {
        List<ThirdPerson> thirdPeople = getAll();
        for(ThirdPerson thirdPerson : thirdPeople){
            if(thirdPerson.personId().equalsIgnoreCase(personId)) return thirdPerson;
        }
        return null;
    }

    @Override
    public List<ThirdPerson> getAll() {
        return this.thirdPersonRepository.findAll();
    }

}
