package ac.za.cput.repository;
import ac.za.cput.domain.PasswordValidation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PasswordValidationRepository extends JpaRepository<PasswordValidation, String> {
    //Set<PasswordValidation> getAll();
}
