package ac.za.cput.repository.impl;

import ac.za.cput.domain.PersonPassword;
import ac.za.cput.repository.PersonPasswordRepository;

import java.util.HashSet;
import java.util.Set;

public class PersonPasswordRepositoryImpl implements PersonPasswordRepository{

    private static PersonPasswordRepositoryImpl repository = null;
    private Set<PersonPassword> personPasswords;

    private PersonPasswordRepositoryImpl()
    {
        this.personPasswords = new HashSet<>();
    }

    public static PersonPasswordRepository getRepository()
    {
        if(repository == null) repository = new PersonPasswordRepositoryImpl();
        return repository;
    }

    public PersonPassword create(PersonPassword personPassword)
    {
        this.personPasswords.add(personPassword);
        return personPassword;
    }

    public PersonPassword read(String password)
    {
        this.personPasswords.contains(password);
        return null;
    }

    public PersonPassword update(PersonPassword personPassword)
    {
        if(personPasswords == personPassword){
            this.personPasswords.add(personPassword);
        }
        return personPassword;
    }

    public void delete(String pass)
    {
        this.personPasswords.remove(pass);
    }


    public Set<PersonPassword> getAll()
    {
        return this.personPasswords;
    }
}
