package ac.za.cput.repository.impl;

import ac.za.cput.domain.Person;
import ac.za.cput.factory.PersonFactory;
import ac.za.cput.repository.PersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class PersonRepositoryImplTest {

    private PersonRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = PersonRepositoryImpl.getRepository();
    }


    @Test
    public void a_create() {
        Person person = PersonFactory.getPerson("Tshepo","Sepadile","00001");
        repository.create(person);
        Assert.assertNotNull(person);
    }

    @Test
    public void b_read() {
        Person p = PersonFactory.getPerson("Tshepo", "Sepadile", "00001");
        //p = repository.create(p);
        Assert.assertNotNull(p);

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
    public void d_getAll() {
        //create(); //Comment the create method out when you run all tests at once
        Set<Person> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}