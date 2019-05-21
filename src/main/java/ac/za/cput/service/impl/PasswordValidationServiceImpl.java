package ac.za.cput.service.impl;

import ac.za.cput.domain.PasswordValidation;
import ac.za.cput.repository.PasswordValidationRepository;
import ac.za.cput.service.PasswordValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class PasswordValidationServiceImpl implements PasswordValidationService {

    @Autowired
    @Qualifier("InMemory")

    private PasswordValidationRepository repository;

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
