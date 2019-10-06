package ac.za.cput.service.impl;

import ac.za.cput.domain.PersonPassword;
import ac.za.cput.repository.PersonPasswordRepository;
import ac.za.cput.service.PersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PersonPasswordServiceImpl implements PersonPasswordService {

    private static PersonPasswordService personPasswordService = null;

    @Autowired
    private PersonPasswordRepository personPasswordRepository;

    private PersonPasswordServiceImpl()
    {

    }

    public static PersonPasswordService getPersonPasswordService()
    {
        if(personPasswordService == null) personPasswordService = new PersonPasswordServiceImpl();
        return personPasswordService;
    }



    @Override
    public PersonPassword create(PersonPassword person)
    {
        return this.personPasswordRepository.save(person);
    }

    @Override
    public PersonPassword update(PersonPassword person)
    {
        return this.personPasswordRepository.save(person);
    }

    @Override
    public void delete(String p)
    {
        this.personPasswordRepository.deleteById(p);
    }

    @Override
    public PersonPassword read(String p)
    {
        Optional<PersonPassword> optionalPersonPassword = this.personPasswordRepository.findById(p);
        return optionalPersonPassword.orElse(null);
    }

    @Override
    public PersonPassword retrieveById(String password)
    {
        List<PersonPassword> personPasswordList = getAll();
        for(PersonPassword personPassword : personPasswordList){
            if(personPassword.password().equalsIgnoreCase(password)) return personPassword;
        }
        return null;
    }

    @Override
    public List<PersonPassword> getAll() {
        return this.personPasswordRepository.findAll();
    }

}
