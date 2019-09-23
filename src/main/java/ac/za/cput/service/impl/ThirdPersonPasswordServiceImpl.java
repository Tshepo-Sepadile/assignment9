package ac.za.cput.service.impl;

import ac.za.cput.domain.ThirdPersonPassword;
import ac.za.cput.repository.ThirdPersonPasswordRepository;
import ac.za.cput.repository.impl.ThirdPersonPasswordRepositoryImpl;
import ac.za.cput.service.ThirdPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ThirdPersonPasswordServiceImpl")
public class ThirdPersonPasswordServiceImpl implements ThirdPersonPasswordService {

    private ThirdPersonPasswordServiceImpl service = null;

    private ThirdPersonPasswordRepository repository;

    public ThirdPersonPasswordServiceImpl()
    {
        this.repository = ThirdPersonPasswordRepositoryImpl.getRepository();
    }

    public ThirdPersonPasswordServiceImpl getService()
    {
        if(service == null)
        {
            service = new ThirdPersonPasswordServiceImpl();
        }

        return service;
    }

    @Override
    public ThirdPersonPassword create(ThirdPersonPassword personPassword)
    {
        return repository.create(personPassword);
    }

    @Override
    public ThirdPersonPassword update(ThirdPersonPassword personPassword)
    {
        return repository.update(personPassword);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public ThirdPersonPassword read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<ThirdPersonPassword> getAll() {
        return repository.getAll();
    }

}
