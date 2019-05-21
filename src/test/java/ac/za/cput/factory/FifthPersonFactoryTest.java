package ac.za.cput.factory;

import ac.za.cput.domain.FifthPerson;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FifthPersonFactoryTest {

    @Test
    public void getFifthPerson() {
        FifthPerson fifthPerson  = FifthPersonFactory.getPerson("Tinashe", "Madzimbamuto", "00005");
        Assert.assertNotNull(fifthPerson.personName());
    }
}