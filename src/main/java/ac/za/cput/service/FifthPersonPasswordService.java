package ac.za.cput.service;

import ac.za.cput.domain.FifthPersonPassword;

import java.util.List;
import java.util.Set;

public interface FifthPersonPasswordService extends IService<FifthPersonPassword, String> {

    FifthPersonPassword retrieveById(String password);
    List<FifthPersonPassword> getAll();
}
