package ac.za.cput.factory;

import ac.za.cput.domain.FourthPersonPassword;

public class FourthPersonPasswordFactory {

    public static FourthPersonPassword getFourthPersonPassword(String passW4) {
        return new FourthPersonPassword.Builder().passW4(passW4).build();
    }
}
