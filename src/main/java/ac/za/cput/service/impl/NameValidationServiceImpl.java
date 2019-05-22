package ac.za.cput.service.impl;

import ac.za.cput.domain.NameValidation;
import ac.za.cput.repository.NameValidationRepository;
import ac.za.cput.service.NameValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("NameValidationServiceImpl")
public class NameValidationServiceImpl implements NameValidationService {

    @Autowired
    @Qualifier("InMemory")

    private NameValidationRepository repository;

    @Override
    public NameValidation create(NameValidation nameValidation)
    {
        return repository.create(nameValidation);
    }

    @Override
    public NameValidation update(NameValidation nameValidation)
    {
        return repository.update(nameValidation);
    }

    @Override
    public void delete(String p)
    {
        repository.delete(p);
    }

    @Override
    public NameValidation read(String p)
    {
        return repository.read(p);
    }
    @Override
    public Set<NameValidation> getAll() {
        return repository.getAll();
    }

}
