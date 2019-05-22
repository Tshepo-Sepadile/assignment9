package ac.za.cput.service.impl;

import ac.za.cput.domain.FifthPerson;
import ac.za.cput.repository.FifthPersonRepository;
import ac.za.cput.service.FifthPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("FifthServiceImpl")
public class FifthPersonServiceImpl implements FifthPersonService {

    @Autowired
    @Qualifier("InMemory")

    private FifthPersonRepository repository;

    @Override
    public FifthPerson create(FifthPerson person)
    {
        return repository.create(person);
    }

    @Override
    public FifthPerson update(FifthPerson person)
    {
        return repository.update(person);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public FifthPerson read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<FifthPerson> getAll() {
        return repository.getAll();
    }

}
