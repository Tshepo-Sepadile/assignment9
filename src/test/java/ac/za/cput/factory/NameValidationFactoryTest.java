package ac.za.cput.factory;

import ac.za.cput.domain.NameValidation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameValidationFactoryTest {

    @Test
    public void getNameValidation() {

        NameValidation nameValidation = NameValidationFactory.getNameValidation("Correct");

        Assert.assertEquals("Correct", nameValidation.validateName());
    }

}