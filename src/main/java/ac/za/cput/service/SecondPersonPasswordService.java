package ac.za.cput.service;

import ac.za.cput.domain.SecondPersonPassword;

import java.util.Set;

public interface SecondPersonPasswordService extends IService<SecondPersonPassword, String> {

    Set<SecondPersonPassword> getAll();
}
