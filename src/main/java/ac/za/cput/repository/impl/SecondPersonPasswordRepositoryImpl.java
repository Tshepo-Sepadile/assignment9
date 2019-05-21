package ac.za.cput.repository.impl;

import ac.za.cput.domain.SecondPersonPassword;
import ac.za.cput.repository.SecondPersonPasswordRepository;

import java.util.HashSet;
import java.util.Set;

public class SecondPersonPasswordRepositoryImpl implements SecondPersonPasswordRepository{

    private static SecondPersonPasswordRepositoryImpl repository = null;
    private Set<SecondPersonPassword> secondPersonPasswords;

    private SecondPersonPasswordRepositoryImpl()
    {
        this.secondPersonPasswords = new HashSet<>();
    }

    public static SecondPersonPasswordRepository getRepository()
    {
        if(repository == null) repository = new SecondPersonPasswordRepositoryImpl();
        return repository;
    }

    public SecondPersonPassword create(SecondPersonPassword secondPersonPassword)
    {
        this.secondPersonPasswords.add(secondPersonPassword);
        return secondPersonPassword;
    }

    public SecondPersonPassword read(String password)
    {
        this.secondPersonPasswords.contains(password);
        return null;
    }

    public SecondPersonPassword update(SecondPersonPassword secondPersonPassword)
    {
        if(secondPersonPasswords == secondPersonPassword){
            this.secondPersonPasswords.add(secondPersonPassword);
        }
        return secondPersonPassword;
    }

    public void delete(String pass)
    {
        this.secondPersonPasswords.remove(pass);
    }


    public Set<SecondPersonPassword> getAll()
    {
        return this.secondPersonPasswords;
    }
}
