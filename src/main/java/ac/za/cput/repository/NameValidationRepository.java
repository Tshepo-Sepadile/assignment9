package ac.za.cput.repository;
import ac.za.cput.domain.NameValidation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface NameValidationRepository extends JpaRepository<NameValidation, String> {
    //Set<NameValidation> getAll();
}
