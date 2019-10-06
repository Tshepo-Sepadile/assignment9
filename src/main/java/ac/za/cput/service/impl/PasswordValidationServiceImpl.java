package ac.za.cput.service.impl;

import ac.za.cput.domain.PasswordValidation;
import ac.za.cput.repository.PasswordValidationRepository;
import ac.za.cput.service.PasswordValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PasswordValidationServiceImpl implements PasswordValidationService {

    private static PasswordValidationService passwordValidationService = null;

    @Autowired
    private PasswordValidationRepository passwordValidationRepository;

    private PasswordValidationServiceImpl()
    {

    }

    public static PasswordValidationService getPasswordValidationService()
    {
        if(passwordValidationService == null) passwordValidationService = new PasswordValidationServiceImpl();
        return passwordValidationService;
    }



    @Override
    public PasswordValidation create(PasswordValidation passwordValidation)
    {
        return this.passwordValidationRepository.save(passwordValidation);
    }

    @Override
    public PasswordValidation update(PasswordValidation passwordValidation)
    {
        return this.passwordValidationRepository.save(passwordValidation);
    }

    @Override
    public void delete(String p)
    {
        this.passwordValidationRepository.deleteById(p);
    }

    @Override
    public PasswordValidation read(String p)
    {
        Optional<PasswordValidation> optionalPasswordValidation = this.passwordValidationRepository.findById(p);
        return optionalPasswordValidation.orElse(null);
    }

    @Override
    public PasswordValidation retrieveById(String valPassword)
    {
        List<PasswordValidation> passwordValidations = getAll();
        for(PasswordValidation passwordValidation : passwordValidations){
            if(passwordValidation.validatePassword().equalsIgnoreCase(valPassword)) return passwordValidation;
        }
        return null;
    }

    @Override
    public List<PasswordValidation> getAll() {
        return this.passwordValidationRepository.findAll();
    }

}
