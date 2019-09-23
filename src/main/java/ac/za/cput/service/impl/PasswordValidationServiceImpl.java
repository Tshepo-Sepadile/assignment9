package ac.za.cput.service.impl;

import ac.za.cput.domain.PasswordValidation;
import ac.za.cput.repository.PasswordValidationRepository;
import ac.za.cput.repository.impl.PasswordValidationRepositoryImpl;
import ac.za.cput.service.PasswordValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("PasswordValidationServiceImpl")
public class PasswordValidationServiceImpl implements PasswordValidationService {

    private PasswordValidationServiceImpl service = null;

    private PasswordValidationRepository repository;

    public PasswordValidationServiceImpl()
    {
        this.repository = PasswordValidationRepositoryImpl.getRepository();
    }

    public PasswordValidationServiceImpl getService()
    {
        if(service == null)
        {
            service = new PasswordValidationServiceImpl();
        }

        return service;
    }

    @Override
    public PasswordValidation create(PasswordValidation passwordValidation)
    {
        return repository.create(passwordValidation);
    }

    @Override
    public PasswordValidation update(PasswordValidation passwordValidation)
    {
        return repository.update(passwordValidation);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public PasswordValidation read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<PasswordValidation> getAll() {
        return repository.getAll();
    }

}
