package ac.za.cput.service;

import ac.za.cput.domain.NameValidation;

import java.util.Set;

public interface NameValidationService extends IService<NameValidation, String> {

    Set<NameValidation> getAll();
}
