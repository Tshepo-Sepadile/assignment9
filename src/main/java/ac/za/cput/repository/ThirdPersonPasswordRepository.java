package ac.za.cput.repository;
import ac.za.cput.domain.ThirdPersonPassword;

import java.util.Set;

public interface ThirdPersonPasswordRepository extends IRepository<ThirdPersonPassword, String> {
    Set<ThirdPersonPassword> getAll();
}
