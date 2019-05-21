package ac.za.cput.factory;
import ac.za.cput.domain.SecondPersonPassword;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondPersonPasswordFactoryTest {

    @Test
    public void getSecondPersonPassword() {

        SecondPersonPassword secondPersonPassword = SecondPersonPasswordFactory.getSecondPersonPassword("678910");
        Assert.assertEquals("678910", secondPersonPassword.password());
    }
}