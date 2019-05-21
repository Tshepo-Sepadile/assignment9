package ac.za.cput.factory;

import ac.za.cput.domain.ThirdPersonPassword;

public class ThirdPersonPasswordFactory {

    public static ThirdPersonPassword getThirdPersonPassword(String passW3) {
        return new ThirdPersonPassword.Builder().passW3(passW3).build();
    }
}
