package ac.za.cput.factory;

import ac.za.cput.domain.FifthPersonPassword;

public class FifthPersonPasswordFactory {

    public static FifthPersonPassword getFifthPersonPassword(String passW5) {
        return new FifthPersonPassword.Builder().passW5(passW5).build();
    }
}
