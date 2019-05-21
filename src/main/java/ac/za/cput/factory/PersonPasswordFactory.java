package ac.za.cput.factory;

import ac.za.cput.domain.PersonPassword;

public class PersonPasswordFactory {

    public static PersonPassword getPersonPassword(String passW) {
        return new PersonPassword.Builder().passW(passW).build();
    }
}
