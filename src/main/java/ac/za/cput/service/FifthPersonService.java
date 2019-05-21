package ac.za.cput.service;

import ac.za.cput.domain.FifthPerson;

import java.util.Set;

public interface FifthPersonService extends IService<FifthPerson, String> {

    Set<FifthPerson> getAll();
}
