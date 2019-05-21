package ac.za.cput.service.impl;

import ac.za.cput.domain.SecondPersonPassword;
import ac.za.cput.repository.SecondPersonPasswordRepository;
import ac.za.cput.service.SecondPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class SecondPersonPasswordServiceImpl implements SecondPersonPasswordService {

    @Autowired
    @Qualifier("InMemory")

    private SecondPersonPasswordRepository repository;

    @Override
    public SecondPersonPassword create(SecondPersonPassword personPassword)
    {
        return repository.create(personPassword);
    }

    @Override
    public SecondPersonPassword update(SecondPersonPassword personPassword)
    {
        return repository.update(personPassword);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public SecondPersonPassword read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<SecondPersonPassword> getAll() {
        return repository.getAll();
    }

}
