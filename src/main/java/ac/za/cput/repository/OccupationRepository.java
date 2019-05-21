package ac.za.cput.repository;
import ac.za.cput.domain.Occupation;

import java.util.Set;

public interface OccupationRepository extends IRepository<Occupation, String> {
    Set<Occupation> getAll();
}
