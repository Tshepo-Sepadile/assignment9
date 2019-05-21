package ac.za.cput.repository.impl;

import ac.za.cput.domain.FifthPersonPassword;
import ac.za.cput.repository.FifthPersonPasswordRepository;

import java.util.HashSet;
import java.util.Set;

public class FifthPersonPasswordRepositoryImpl implements FifthPersonPasswordRepository{

    private static FifthPersonPasswordRepositoryImpl repository = null;
    private Set<FifthPersonPassword> fifthPersonPasswords;

    private FifthPersonPasswordRepositoryImpl()
    {
        this.fifthPersonPasswords = new HashSet<>();
    }

    public static FifthPersonPasswordRepository getRepository()
    {
        if(repository == null) repository = new FifthPersonPasswordRepositoryImpl();
        return repository;
    }

    public FifthPersonPassword create(FifthPersonPassword fifthPersonPassword)
    {
        this.fifthPersonPasswords.add(fifthPersonPassword);
        return fifthPersonPassword;
    }

    public FifthPersonPassword read(String password)
    {
        this.fifthPersonPasswords.contains(password);
        return null;
    }

    public FifthPersonPassword update(FifthPersonPassword fifthPersonPassword)
    {
        if(fifthPersonPasswords == fifthPersonPassword){
            this.fifthPersonPasswords.add(fifthPersonPassword);
        }
        return fifthPersonPassword;
    }

    public void delete(String pass)
    {
        this.fifthPersonPasswords.remove(pass);
    }


    public Set<FifthPersonPassword> getAll()
    {
        return this.fifthPersonPasswords;
    }
}
