package ac.za.cput.service.impl;

import ac.za.cput.domain.Person;
import ac.za.cput.repository.PersonRepository;
import ac.za.cput.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("PersonServiceImpl")
public class PersonServiceImpl implements PersonService {

    @Autowired
    @Qualifier("InMemory")

    private PersonRepository repository;

    @Override
    public Person create(Person person)
    {
        return repository.create(person);
    }

    @Override
    public Person update(Person person)
    {
        return repository.update(person);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public Person read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<Person> getAll() {
        return repository.getAll();
    }

}
