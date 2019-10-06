package ac.za.cput.service;

import ac.za.cput.domain.SecondPerson;

import java.util.List;
import java.util.Set;

public interface SecondPersonService extends IService<SecondPerson, String> {

    SecondPerson retrieveById(String PersonId);
    List<SecondPerson> getAll();
}
