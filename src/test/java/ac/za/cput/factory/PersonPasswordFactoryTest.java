package ac.za.cput.factory;
import ac.za.cput.domain.PersonPassword;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonPasswordFactoryTest {

    @Test
    public void getPersonPassword() {

        PersonPassword personPassword = PersonPasswordFactory.getPersonPassword("12345");
        Assert.assertEquals("12345", personPassword.password());
    }
}