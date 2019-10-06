package ac.za.cput.service;

import ac.za.cput.domain.ThirdPersonPassword;

import java.util.List;
import java.util.Set;

public interface ThirdPersonPasswordService extends IService<ThirdPersonPassword, String> {

    ThirdPersonPassword retrieveById(String personId);
    List<ThirdPersonPassword> getAll();
}
