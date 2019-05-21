package ac.za.cput.service.impl;

import ac.za.cput.domain.FourthPerson;
import ac.za.cput.repository.FourthPersonRepository;
import ac.za.cput.service.FourthPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class FourthPersonServiceImpl implements FourthPersonService {

    @Autowired
    @Qualifier("InMemory")

    private FourthPersonRepository repository;

    @Override
    public FourthPerson create(FourthPerson person)
    {
        return repository.create(person);
    }

    @Override
    public FourthPerson update(FourthPerson person)
    {
        return repository.update(person);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public FourthPerson read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<FourthPerson> getAll() {
        return repository.getAll();
    }

}
