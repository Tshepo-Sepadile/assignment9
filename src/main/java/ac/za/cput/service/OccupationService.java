package ac.za.cput.service;

import ac.za.cput.domain.Occupation;

import java.util.List;
import java.util.Set;

public interface OccupationService extends IService<Occupation, String> {

    Occupation retrieveById(String personId);
    List<Occupation> getAll();
}
