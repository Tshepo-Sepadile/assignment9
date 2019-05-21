package ac.za.cput.factory;

import ac.za.cput.domain.SecondPerson;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondPersonFactoryTest {

        @Test
        public void getSecondPerson() {
            SecondPerson secondPerson = SecondPersonFactory.getPerson("Valery", "Burtsev", "00002");
            Assert.assertEquals("00002", secondPerson.personId());
        }
}