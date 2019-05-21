package ac.za.cput.factory;

import ac.za.cput.domain.PasswordValidation;

public class PasswordValidationFactory {

    public static PasswordValidation getPasswordValidation(String passwordVal)
    {
        return new PasswordValidation.Builder().passwordVal(passwordVal).build();
    }
}
