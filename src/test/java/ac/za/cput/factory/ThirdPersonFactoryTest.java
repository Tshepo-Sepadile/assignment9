package ac.za.cput.factory;

import ac.za.cput.domain.ThirdPerson;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThirdPersonFactoryTest {

    @Test
    public void getThirdPerson() {
        ThirdPerson thirdPerson  = ThirdPersonFactory.getPerson("Max", "Steel", "00003");
        Assert.assertEquals("Steel",thirdPerson.personSurname());
    }
}