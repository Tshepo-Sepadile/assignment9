package ac.za.cput.service.impl;

import ac.za.cput.domain.Occupation;
import ac.za.cput.factory.OccupationFactory;
import ac.za.cput.repository.OccupationRepository;
import ac.za.cput.service.OccupationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class OccupationServiceImplTest {

    @Autowired
    private OccupationService service;

    @Test
    public void a_create() {

        Occupation occupation = OccupationFactory.getOccupation("12345");
        occupation = service.create(occupation);
        Assert.assertEquals("12345", occupation.occupationIdentity());
    }

    @Test
    public void c_update() {

        String occID = "3255";
        Occupation occupation = OccupationFactory.getOccupation(occID);
        occupation = service.update(occupation);
        Assert.assertEquals("3255", occupation.occupationIdentity());


    }

    @Test
    public void e_delete() {

        String occID = "12345";
        service.delete(occID);
        assertNull(service.read(occID));
    }

    @Test
    public void b_read() {

        Occupation occupation = OccupationFactory.getOccupation("12345");
        occupation = service.create(occupation);
        Assert.assertNotNull(occupation);
    }

    @Test
    public void d_getAll() {

        a_create(); //Comment the create method out when you run all tests at once
        List<Occupation> persons = this.service.getAll();
        Assert.assertEquals(1, persons.size());
    }
}