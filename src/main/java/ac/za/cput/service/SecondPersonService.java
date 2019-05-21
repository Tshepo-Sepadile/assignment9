package ac.za.cput.service;

import ac.za.cput.domain.SecondPerson;

import java.util.Set;

public interface SecondPersonService extends IService<SecondPerson, String> {

    Set<SecondPerson> getAll();
}
