package ac.za.cput.service;

import ac.za.cput.domain.NameValidation;

import java.util.List;
import java.util.Set;

public interface NameValidationService extends IService<NameValidation, String> {

    NameValidation retrieveById(String personId);
    List<NameValidation> getAll();
}
