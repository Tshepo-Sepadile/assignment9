package ac.za.cput.factory;

import ac.za.cput.domain.SecondPersonPassword;

public class SecondPersonPasswordFactory {

    public static SecondPersonPassword getSecondPersonPassword(String passW2) {
        return new SecondPersonPassword.Builder().passW2(passW2).build();
    }
}
