package ac.za.cput.service.impl;

import ac.za.cput.domain.ThirdPerson;
import ac.za.cput.repository.ThirdPersonRepository;
import ac.za.cput.service.ThirdPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ThirdPersonServiceImpl")
public class ThirdPersonServiceImpl implements ThirdPersonService {

    @Autowired
    @Qualifier("InMemory")

    private ThirdPersonRepository repository;

    @Override
    public ThirdPerson create(ThirdPerson person)
    {
        return repository.create(person);
    }

    @Override
    public ThirdPerson update(ThirdPerson person)
    {
        return repository.update(person);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public ThirdPerson read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<ThirdPerson> getAll() {
        return repository.getAll();
    }

}
