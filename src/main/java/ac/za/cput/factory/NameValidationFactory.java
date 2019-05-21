package ac.za.cput.factory;

import ac.za.cput.domain.NameValidation;

public class NameValidationFactory {

    public static NameValidation getNameValidation(String nameVal)
    {
        return new NameValidation.Builder().nameVal(nameVal).build();
    }
}
