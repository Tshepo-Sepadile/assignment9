package ac.za.cput.service.impl;

import ac.za.cput.domain.FourthPersonPassword;
import ac.za.cput.repository.FourthPersonPasswordRepository;
import ac.za.cput.service.FourthPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class FourthPersonPasswordServiceImpl implements FourthPersonPasswordService {

    @Autowired
    @Qualifier("InMemory")

    private FourthPersonPasswordRepository repository;

    @Override
    public FourthPersonPassword create(FourthPersonPassword personPassword)
    {
        return repository.create(personPassword);
    }

    @Override
    public FourthPersonPassword update(FourthPersonPassword personPassword)
    {
        return repository.update(personPassword);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public FourthPersonPassword read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<FourthPersonPassword> getAll() {
        return repository.getAll();
    }

}
