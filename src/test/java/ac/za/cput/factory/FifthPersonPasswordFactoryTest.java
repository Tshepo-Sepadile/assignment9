package ac.za.cput.factory;
import ac.za.cput.domain.FifthPersonPassword;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FifthPersonPasswordFactoryTest {

    @Test
    public void getFifthPersonPassword() {

        FifthPersonPassword fifthPersonPassword = FifthPersonPasswordFactory.getFifthPersonPassword("2122232425");
        Assert.assertEquals("2122232425", fifthPersonPassword.password());
    }
}