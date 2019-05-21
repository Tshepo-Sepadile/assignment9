package ac.za.cput.repository.impl;

import ac.za.cput.domain.PasswordValidation;
import ac.za.cput.repository.PasswordValidationRepository;

import java.util.HashSet;
import java.util.Set;

public class PasswordValidationRepositoryImpl implements PasswordValidationRepository {

    private static PasswordValidationRepositoryImpl repository = null;
    private Set<PasswordValidation> passwordValidations;

    private PasswordValidationRepositoryImpl()
    {
        this.passwordValidations = new HashSet<>();
    }

    public static PasswordValidationRepository getRepository()
    {
        if(repository == null) repository = new PasswordValidationRepositoryImpl();
        return repository;
    }

    public PasswordValidation create(PasswordValidation passwordValidation)
    {
        this.passwordValidations.add(passwordValidation);
        return passwordValidation;
    }

    public PasswordValidation read(String passwordVal)
    {
        this.passwordValidations.contains(passwordVal);
        return null;
    }

    public PasswordValidation update(PasswordValidation passwordValidation)
    {
        if(passwordValidations == passwordValidation){
            this.passwordValidations.add(passwordValidation);
        }
        return passwordValidation;
    }

    public void delete(String pass)
    {
        this.passwordValidations.remove(pass);
    }


    public Set<PasswordValidation> getAll()
    {
        return this.passwordValidations;
    }
}
