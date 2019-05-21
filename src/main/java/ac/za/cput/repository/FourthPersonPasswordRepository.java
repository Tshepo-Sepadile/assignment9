package ac.za.cput.repository;
import ac.za.cput.domain.FourthPersonPassword;

import java.util.Set;

public interface FourthPersonPasswordRepository extends IRepository<FourthPersonPassword, String> {
    Set<FourthPersonPassword> getAll();
}
