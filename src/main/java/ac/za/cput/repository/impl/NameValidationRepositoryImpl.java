package ac.za.cput.repository.impl;

import ac.za.cput.domain.NameValidation;
import ac.za.cput.repository.NameValidationRepository;

import java.util.HashSet;
import java.util.Set;

public class NameValidationRepositoryImpl implements NameValidationRepository{

    private static NameValidationRepositoryImpl repository = null;
    private Set<NameValidation> nameValidations;

    private NameValidationRepositoryImpl()
    {
        this.nameValidations = new HashSet<>();
    }

    public static NameValidationRepository getRepository()
    {
        if(repository == null) repository = new NameValidationRepositoryImpl();
        return repository;
    }

    public NameValidation create(NameValidation nameValidation)
    {
        this.nameValidations.add(nameValidation);
        return nameValidation;
    }

    public NameValidation read(String nameVal)
    {
        this.nameValidations.contains(nameVal);
        return null;
    }

    public NameValidation update(NameValidation nameValidation)
    {
        if(nameValidations == nameValidation){
            this.nameValidations.add(nameValidation);
        }
        return nameValidation;
    }

    public void delete(String pass)
    {
        this.nameValidations.remove(pass);
    }


    public Set<NameValidation> getAll()
    {
        return this.nameValidations;
    }
}
