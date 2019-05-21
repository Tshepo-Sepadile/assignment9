package ac.za.cput.repository;
import ac.za.cput.domain.SecondPersonPassword;

import java.util.Set;

public interface SecondPersonPasswordRepository extends IRepository<SecondPersonPassword, String> {
    Set<SecondPersonPassword> getAll();
}
