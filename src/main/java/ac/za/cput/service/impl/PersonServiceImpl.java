package ac.za.cput.service.impl;

import ac.za.cput.domain.Person;
import ac.za.cput.repository.PersonRepository;
//import ac.za.cput.repository.impl.PersonRepositoryImpl;
import ac.za.cput.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PersonServiceImpl implements PersonService {

    private static PersonService personService = null;

    @Autowired
    private PersonRepository personRepository;

    private PersonServiceImpl()
    {

    }

    public static PersonService getPersonService()
    {
        if(personService == null) personService = new PersonServiceImpl();
        return personService;
    }



    @Override
    public Person create(Person person)
    {
        return this.personRepository.save(person);
    }

    @Override
    public Person update(Person person)
    {
        return this.personRepository.save(person);
    }

    @Override
    public void delete(String p)
    {
        this.personRepository.deleteById(p);
    }

    @Override
    public Person read(String p)
    {
        Optional<Person> optionalPerson = this.personRepository.findById(p);
        return optionalPerson.orElse(null);
    }

    @Override
    public Person retrieveById(String personId)
    {
        List<Person> people = getAll();
        for(Person person : people){
            if(person.personId().equalsIgnoreCase(personId)) return person;
        }
        return null;
    }

    @Override
    public List<Person> getAll() {
        return this.personRepository.findAll();
    }

}
