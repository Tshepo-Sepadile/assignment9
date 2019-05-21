package ac.za.cput.repository;
import ac.za.cput.domain.FifthPersonPassword;

import java.util.Set;

public interface FifthPersonPasswordRepository extends  IRepository<FifthPersonPassword, String> {
    Set<FifthPersonPassword> getAll();
}
