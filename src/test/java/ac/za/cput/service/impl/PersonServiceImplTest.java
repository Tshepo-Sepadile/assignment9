package ac.za.cput.service.impl;

import ac.za.cput.domain.Person;
import ac.za.cput.factory.PersonFactory;
import ac.za.cput.repository.PersonRepository;
import ac.za.cput.repository.impl.PersonRepositoryImpl;
import ac.za.cput.service.PersonService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PersonServiceImplTest {

    @Autowired
    private PersonService service;

    @Test
    public void a_create() {

        Person person = PersonFactory.getPerson("Tshepo","Sepadile","00001");
        person = service.create(person);
        Assert.assertEquals("Tshepo", person.personName());
    }

    @Test
    public void c_update() {

        String personId = "00006";
        Person person = PersonFactory.getPerson("Tshepo", "Sepadile", personId);
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

        Person p = PersonFactory.getPerson("Tshepo", "Sepadile", "00001");
        p = service.create(p);
        Assert.assertNotNull(p);
    }

    @Test
    public void d_getAll() {

        a_create(); //Comment the create method out when you run all tests at once
        Set<Person> persons = this.service.getAll();
        Assert.assertEquals(1, persons.size());
    }
}