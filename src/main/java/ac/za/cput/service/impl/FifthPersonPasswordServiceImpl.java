package ac.za.cput.service.impl;

import ac.za.cput.domain.FifthPersonPassword;
import ac.za.cput.repository.FifthPersonPasswordRepository;
import ac.za.cput.service.FifthPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class FifthPersonPasswordServiceImpl implements FifthPersonPasswordService {

    @Autowired
    @Qualifier("InMemory")

    private FifthPersonPasswordRepository repository;

    @Override
    public FifthPersonPassword create(FifthPersonPassword personPassword)
    {
        return repository.create(personPassword);
    }

    @Override
    public FifthPersonPassword update(FifthPersonPassword personPassword)
    {
        return repository.update(personPassword);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public FifthPersonPassword read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<FifthPersonPassword> getAll() {
        return repository.getAll();
    }

}
