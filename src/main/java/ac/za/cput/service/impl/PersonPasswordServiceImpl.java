package ac.za.cput.service.impl;

import ac.za.cput.domain.PersonPassword;
import ac.za.cput.repository.PersonPasswordRepository;
import ac.za.cput.repository.impl.PersonPasswordRepositoryImpl;
import ac.za.cput.service.PersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("PersonPasswordServiceImpl")
public class PersonPasswordServiceImpl implements PersonPasswordService {

    private PersonPasswordServiceImpl service = null;

    private PersonPasswordRepository repository;

    public PersonPasswordServiceImpl()
    {
        this.repository = PersonPasswordRepositoryImpl.getRepository();
    }

    public PersonPasswordServiceImpl getService()
    {
        if(service == null)
        {
            service = new PersonPasswordServiceImpl();
        }

        return service;
    }

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
