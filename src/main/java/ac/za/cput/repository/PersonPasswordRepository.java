package ac.za.cput.repository;
import ac.za.cput.domain.PersonPassword;

import java.util.Set;

public interface PersonPasswordRepository extends IRepository<PersonPassword, String> {
    Set<PersonPassword> getAll();
}
