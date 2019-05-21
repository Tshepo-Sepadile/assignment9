package ac.za.cput.repository;
import ac.za.cput.domain.NameValidation;

import java.util.Set;

public interface NameValidationRepository extends IRepository<NameValidation, String> {
    Set<NameValidation> getAll();
}
