package ac.za.cput.service.impl;

import ac.za.cput.domain.NameValidation;
import ac.za.cput.repository.NameValidationRepository;
import ac.za.cput.service.NameValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class NameValidationServiceImpl implements NameValidationService {

    private static NameValidationService nameValidationService = null;

    @Autowired
    private NameValidationRepository nameValidationRepository;

    private NameValidationServiceImpl()
    {

    }

    public static NameValidationService getNameValidationService()
    {
        if(nameValidationService == null) nameValidationService = new NameValidationServiceImpl();
        return nameValidationService;
    }



    @Override
    public NameValidation create(NameValidation nameValidation)
    {
        return this.nameValidationRepository.save(nameValidation);
    }

    @Override
    public NameValidation update(NameValidation nameValidation)
    {
        return this.nameValidationRepository.save(nameValidation);
    }

    @Override
    public void delete(String p)
    {
        this.nameValidationRepository.deleteById(p);
    }

    @Override
    public NameValidation read(String p)
    {
        Optional<NameValidation> optionalNameValidation = this.nameValidationRepository.findById(p);
        return optionalNameValidation.orElse(null);
    }

    @Override
    public NameValidation retrieveById(String nameVal)
    {
        List<NameValidation> nameValidations = getAll();
        for(NameValidation nameValidation : nameValidations){
            if(nameValidation.validateName().equalsIgnoreCase(nameVal)) return nameValidation;
        }
        return null;
    }

    @Override
    public List<NameValidation> getAll() {
        return this.nameValidationRepository.findAll();
    }

}
