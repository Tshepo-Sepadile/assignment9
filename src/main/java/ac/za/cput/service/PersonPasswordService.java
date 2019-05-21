package ac.za.cput.service;

import ac.za.cput.domain.PersonPassword;

import java.util.Set;

public interface PersonPasswordService extends IService<PersonPassword, String> {

    Set<PersonPassword> getAll();
}
