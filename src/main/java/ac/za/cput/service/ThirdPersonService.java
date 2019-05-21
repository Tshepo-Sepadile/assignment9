package ac.za.cput.service;

import ac.za.cput.domain.ThirdPerson;

import java.util.Set;

public interface ThirdPersonService extends IService<ThirdPerson, String> {

    Set<ThirdPerson> getAll();
}
