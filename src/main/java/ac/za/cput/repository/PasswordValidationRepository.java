package ac.za.cput.repository;
import ac.za.cput.domain.PasswordValidation;

import java.util.Set;

public interface PasswordValidationRepository extends IRepository<PasswordValidation, String> {
    Set<PasswordValidation> getAll();
}
