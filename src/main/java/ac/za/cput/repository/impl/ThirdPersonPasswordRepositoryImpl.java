package ac.za.cput.repository.impl;

import ac.za.cput.domain.ThirdPersonPassword;
import ac.za.cput.repository.ThirdPersonPasswordRepository;

import java.util.HashSet;
import java.util.Set;

public class ThirdPersonPasswordRepositoryImpl implements ThirdPersonPasswordRepository{

    private static ThirdPersonPasswordRepositoryImpl repository = null;
    private Set<ThirdPersonPassword> thirdPersonPasswords;

    private ThirdPersonPasswordRepositoryImpl()
    {
        this.thirdPersonPasswords = new HashSet<>();
    }

    public static ThirdPersonPasswordRepository getRepository()
    {
        if(repository == null) repository = new ThirdPersonPasswordRepositoryImpl();
        return repository;
    }

    public ThirdPersonPassword create(ThirdPersonPassword thirdPersonPassword)
    {
        this.thirdPersonPasswords.add(thirdPersonPassword);
        return thirdPersonPassword;
    }

    public ThirdPersonPassword read(String password)
    {
        this.thirdPersonPasswords.contains(password);
        return null;
    }

    public ThirdPersonPassword update(ThirdPersonPassword thirdPersonPassword)
    {
        if(thirdPersonPasswords == thirdPersonPassword){
            this.thirdPersonPasswords.add(thirdPersonPassword);
        }
        return thirdPersonPassword;
    }

    public void delete(String pass)
    {
        this.thirdPersonPasswords.remove(pass);
    }


    public Set<ThirdPersonPassword> getAll()
    {
        return this.thirdPersonPasswords;
    }
}
