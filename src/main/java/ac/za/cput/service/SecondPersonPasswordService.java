package ac.za.cput.service;

import ac.za.cput.domain.SecondPersonPassword;

import java.util.List;
import java.util.Set;

public interface SecondPersonPasswordService extends IService<SecondPersonPassword, String> {

    SecondPersonPassword retrieveById(String personId);
    List<SecondPersonPassword> getAll();
}
