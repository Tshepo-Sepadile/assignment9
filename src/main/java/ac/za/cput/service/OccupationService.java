package ac.za.cput.service;

import ac.za.cput.domain.Occupation;

import java.util.Set;

public interface OccupationService extends IService<Occupation, String> {

    Set<Occupation> getAll();
}
