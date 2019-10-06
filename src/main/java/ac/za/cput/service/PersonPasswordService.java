package ac.za.cput.service;

import ac.za.cput.domain.PersonPassword;

import java.util.List;
import java.util.Set;

public interface PersonPasswordService extends IService<PersonPassword, String> {

    PersonPassword retrieveById(String personId);
    List<PersonPassword> getAll();
}
