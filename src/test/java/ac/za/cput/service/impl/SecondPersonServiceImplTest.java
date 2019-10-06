package ac.za.cput.service.impl;

import ac.za.cput.domain.SecondPerson;
import ac.za.cput.factory.SecondPersonFactory;
import ac.za.cput.repository.SecondPersonRepository;
import ac.za.cput.service.SecondPersonService;
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

public class SecondPersonServiceImplTest {

   @Autowired
    private SecondPersonService service;

    @Test
    public void a_create() {

        SecondPerson person = SecondPersonFactory.getPerson("Tshepo","Sepadile","00001");
        person = service.create(person);
        Assert.assertEquals("Tshepo", person.personName());
    }

    @Test
    public void c_update() {

        String personId = "00006";
        SecondPerson person = SecondPersonFactory.getPerson("Tshepo", "Sepadile", personId);
        person = service.update(person);
        Assert.assertEquals("00006", person.personId());


    }

    @Test
    public void e_delete() {

        String personId = "00001";
        service.delete(personId);
        assertNull(service.read(personId));
    }

    @Test
    public void b_read() {

        SecondPerson p = SecondPersonFactory.getPerson("Tshepo", "Sepadile", "00001");
        p = service.create(p);
        Assert.assertNotNull(p);
    }

    @Test
    public void d_getAll() {

        a_create(); //Comment the create method out when you run all tests at once
        List<SecondPerson> persons = this.service.getAll();
        Assert.assertEquals(1, persons.size());
    }
}