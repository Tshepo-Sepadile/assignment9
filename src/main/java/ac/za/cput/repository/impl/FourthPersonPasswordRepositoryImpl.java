package ac.za.cput.repository.impl;

import ac.za.cput.domain.FourthPersonPassword;
import ac.za.cput.repository.FourthPersonPasswordRepository;

import java.util.HashSet;
import java.util.Set;

public class FourthPersonPasswordRepositoryImpl implements FourthPersonPasswordRepository{

    private static FourthPersonPasswordRepositoryImpl repository = null;
    private Set<FourthPersonPassword> fourthPersonPasswords;

    private FourthPersonPasswordRepositoryImpl()
    {
        this.fourthPersonPasswords = new HashSet<>();
    }

    public static FourthPersonPasswordRepository getRepository()
    {
        if(repository == null) repository = new FourthPersonPasswordRepositoryImpl();
        return repository;
    }

    public FourthPersonPassword create(FourthPersonPassword fourthPersonPassword)
    {
        this.fourthPersonPasswords.add(fourthPersonPassword);
        return fourthPersonPassword;
    }

    public FourthPersonPassword read(String password)
    {
        this.fourthPersonPasswords.contains(password);
        return null;
    }

    public FourthPersonPassword update(FourthPersonPassword fourthPersonPassword)
    {
        if(fourthPersonPasswords == fourthPersonPassword){
            this.fourthPersonPasswords.add(fourthPersonPassword);
        }
        return fourthPersonPassword;
    }
    public void delete(String pass)
    {
        this.fourthPersonPasswords.remove(pass);
    }


    public Set<FourthPersonPassword> getAll()
    {
        return this.fourthPersonPasswords;
    }
}
