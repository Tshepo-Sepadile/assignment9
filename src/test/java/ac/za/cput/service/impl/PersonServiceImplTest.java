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

    //@Autowired
   // private PersonService personService;
    private PersonRepositoryImpl repository;
    private Person person;

    public Person persons()
    {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = PersonRepositoryImpl.getRepository();
        person = PersonFactory.getPerson("Sal", "Monella", "00001");
    }

    @Test
    public void a_create() {

        Person person1 = repository.create(person);
        assertSame(this.person, person1);
        /*Person person = PersonFactory.getPerson("Tshepo","Sepadile","00001");
        person = personService.create(person);
        Assert.assertEquals("Tshepo", person.personName());*/
    }

    @Test
    public void c_update() {

        String personId = "00006";
        Person person = PersonFactory.getPerson("Tshepo", "Sepadile", personId);
        person = repository.update(person);
        Assert.assertEquals("00006", person.personId());


    }

    @Test
    public void e_delete() {

        String personId = "00001";
        repository.delete(personId);
       assertNull(repository.read(personId));
    }

    @Test
    public void b_read() {

        Person p = PersonFactory.getPerson("Tshepo", "Sepadile", "00001");
        p = repository.create(p);
        Assert.assertNotNull(p);
    }

    @Test
    public void d_getAll() {

        //a_create(); //Comment the create method out when you run all tests at once
        Set<Person> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}