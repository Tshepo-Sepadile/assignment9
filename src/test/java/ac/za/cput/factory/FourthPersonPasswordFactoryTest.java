package ac.za.cput.factory;
import ac.za.cput.domain.FourthPersonPassword;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FourthPersonPasswordFactoryTest {

    @Test
    public void getFourthPersonPassword() {

        FourthPersonPassword fourthPersonPassword = FourthPersonPasswordFactory.getFourthPersonPassword("1617181920");
        Assert.assertEquals("1617181920", fourthPersonPassword.password());
    }
}