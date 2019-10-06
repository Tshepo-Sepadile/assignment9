package ac.za.cput.service;

import ac.za.cput.domain.PasswordValidation;

import java.util.List;
import java.util.Set;

public interface PasswordValidationService extends IService<PasswordValidation, String> {

    PasswordValidation retrieveById(String personId);
    List<PasswordValidation> getAll();
}
