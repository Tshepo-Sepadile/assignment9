package ac.za.cput.service.impl;

import ac.za.cput.domain.PersonPassword;
import ac.za.cput.repository.PersonPasswordRepository;
import ac.za.cput.service.PersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class PersonPasswordServiceImpl implements PersonPasswordService {

    @Autowired
    @Qualifier("InMemory")

    private PersonPasswordRepository repository;

    @Override
    public PersonPassword create(PersonPassword personPassword)
    {
        return repository.create(personPassword);
    }

    @Override
    public PersonPassword update(PersonPassword personPassword)
    {
        return repository.update(personPassword);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public PersonPassword read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<PersonPassword> getAll() {
        return repository.getAll();
    }

}
