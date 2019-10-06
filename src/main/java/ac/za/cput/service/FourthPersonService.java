package ac.za.cput.service;

import ac.za.cput.domain.FourthPerson;

import java.util.List;
import java.util.Set;

public interface FourthPersonService extends IService<FourthPerson, String> {

    FourthPerson retrieveById(String personId);
    List<FourthPerson> getAll();
}
