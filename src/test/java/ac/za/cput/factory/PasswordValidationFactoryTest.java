package ac.za.cput.factory;

import ac.za.cput.domain.PasswordValidation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordValidationFactoryTest {

    @Test
    public void getPasswordValidation() {

        PasswordValidation passwordValidation = PasswordValidationFactory.getPasswordValidation("Correct");

        Assert.assertEquals("Correct", passwordValidation.validatePassword());
    }

}