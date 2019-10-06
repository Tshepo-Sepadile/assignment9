package ac.za.cput.service;

import ac.za.cput.domain.FourthPersonPassword;

import java.util.List;
import java.util.Set;

public interface FourthPersonPasswordService extends IService<FourthPersonPassword, String> {

    FourthPersonPassword retrieveById(String personId);
    List<FourthPersonPassword> getAll();
}
