package ac.za.cput.repository.impl;

import ac.za.cput.domain.SecondPerson;
import ac.za.cput.factory.SecondPersonFactory;
import ac.za.cput.repository.SecondPersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class SecondPersonRepositoryImplTest {

    private SecondPersonRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = SecondPersonRepositoryImpl.getRepository();
    }


    @Test
    public void create() {
        SecondPerson person = SecondPersonFactory.getPerson("Valery","Burtsev","00002");
        repository.create(person);
        Assert.assertEquals(1, repository.getAll().size());
    }

    @Test
    public void read() {
        SecondPerson person = SecondPersonFactory.getPerson("Valery", "Burtsev", "00002");
        person = repository.create(person);
        Assert.assertNotNull(person);

    }

    @Test
    public void update() {
        String personId = "00006";
        SecondPerson person = SecondPersonFactory.getPerson("Tshepo", "Sepadile", personId);
        person = repository.update(person);
        Assert.assertEquals("00006", person.personId());
    }

    @Test
    public void delete() {
        String personId = "00001";
        repository.delete(personId);
        assertNull(repository.read(personId));
    }

    @Test
    public void getAll() {
        //create(); //Comment the create method out when you run all tests at once
        Set<SecondPerson> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}