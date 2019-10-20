package ac.za.cput.service.impl;

import ac.za.cput.domain.Person;
import ac.za.cput.repository.PersonRepository;
//import ac.za.cput.repository.impl.PersonRepositoryImpl;
import ac.za.cput.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private static PersonService personService = null;

    @Autowired
    private PersonRepository personRepository;

    private PersonServiceImpl() {}

    public static PersonService getPersonService()
    {
        if(personService == null) {
            personService = new PersonServiceImpl();
        }
        return personService;
    }

    @Override
    public Person create(Person person)
    {
        return this.personRepository.save(person);
    }

    @Override
    public Person read(String personId)
    {
        Optional<Person> optPerson = this.personRepository.findById(personId);
        return optPerson.orElse(null);
    }

    @Override
    public Person update(Person person)
    {
       return this.personRepository.save(person);
    }

    @Override
    public void delete(String personId)
    {
        personRepository.deleteById(personId);
    }

    @Override
    public List<Person> getAll()
    {
        return this.personRepository.findAll();
    }

}
