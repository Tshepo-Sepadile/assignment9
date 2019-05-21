package ac.za.cput.service;

import ac.za.cput.domain.FourthPersonPassword;

import java.util.Set;

public interface FourthPersonPasswordService extends IService<FourthPersonPassword, String> {

    Set<FourthPersonPassword> getAll();
}
