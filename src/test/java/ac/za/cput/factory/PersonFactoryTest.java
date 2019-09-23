package ac.za.cput.factory;

import ac.za.cput.domain.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonFactoryTest {

    @Test
    public void getPerson() {
        Person person = PersonFactory.getPerson("Bart", "Ender", "12345");
        Assert.assertNotNull(person);
    }
}