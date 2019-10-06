package ac.za.cput.service.impl;

import ac.za.cput.domain.Person;
import ac.za.cput.factory.PersonFactory;
import ac.za.cput.repository.PersonRepository;
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

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PersonServiceImplTest {

    @Autowired
   private PersonService personService;
    private Person person;

    public Person persons()
    {
        return this.personService.getAll().iterator().next();
    }


    @Test
    public void a_create() {

        Person person1 = personService.create(person);
        assertSame(this.person, person1);
        /*Person person = PersonFactory.getPerson("Tshepo","Sepadile","00001");
        person = personService.create(person);
        Assert.assertEquals("Tshepo", person.personName());*/
    }

    @Test
    public void c_update() {

        String personId = "00006";
        Person person = PersonFactory.getPerson("Tshepo", "Sepadile", personId);
        person = personService.update(person);
        Assert.assertEquals("00006", person.personId());


    }

    @Test
    public void e_delete() {

        String personId = "00001";
        personService.delete(personId);
       assertNull(personService.read(personId));
    }

    @Test
    public void b_read() {

        Person p = PersonFactory.getPerson("Tshepo", "Sepadile", "00001");
        p = personService.create(p);
        Assert.assertNotNull(p);
    }

    @Test
    public void d_getAll() {

        //a_create(); //Comment the create method out when you run all tests at once
        List<Person> persons = this.personService.getAll();
        Assert.assertEquals(1, persons.size());
    }
}