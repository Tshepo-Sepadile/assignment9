package ac.za.cput.service;

import ac.za.cput.domain.FifthPersonPassword;

import java.util.Set;

public interface FifthPersonPasswordService extends IService<FifthPersonPassword, String> {

    Set<FifthPersonPassword> getAll();
}
