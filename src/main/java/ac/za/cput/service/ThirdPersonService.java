package ac.za.cput.service;

import ac.za.cput.domain.ThirdPerson;

import java.util.List;
import java.util.Set;

public interface ThirdPersonService extends IService<ThirdPerson, String> {

    ThirdPerson retrieveById(String personId);
    List<ThirdPerson> getAll();
}
