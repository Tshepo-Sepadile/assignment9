package ac.za.cput.factory;

import ac.za.cput.domain.Occupation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccupationFactoryTest {

    @Test
    public void getOccupation() {

        Occupation occupation  = OccupationFactory.getOccupation("005123");
        Assert.assertEquals("005123", occupation.occupationIdentity());


    }
}