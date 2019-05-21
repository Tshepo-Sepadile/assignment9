package ac.za.cput.factory;
import ac.za.cput.domain.ThirdPersonPassword;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThirdPersonPasswordFactoryTest {

    @Test
    public void getThirdPersonPassword() {

        ThirdPersonPassword thirdPersonPassword = ThirdPersonPasswordFactory.getThirdPersonPassword("1112131415");
        Assert.assertEquals("1112131415", thirdPersonPassword.password());
    }
}