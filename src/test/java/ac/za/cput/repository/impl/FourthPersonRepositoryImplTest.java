package ac.za.cput.repository.impl;

import ac.za.cput.domain.FourthPerson;
import ac.za.cput.factory.FourthPersonFactory;
import ac.za.cput.repository.FourthPersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class FourthPersonRepositoryImplTest {

    private FourthPersonRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = FourthPersonRepositoryImpl.getRepository();
    }


    @Test
    public void create() {
        FourthPerson person = FourthPersonFactory.getPerson("Henry","Keown","00004");
        repository.create(person);
        Assert.assertEquals(1, repository.getAll().size());
    }

    @Test
    public void read() {
        FourthPerson person = FourthPersonFactory.getPerson("Henry", "Keown", "00004");
        person = repository.create(person);
        Assert.assertNotNull(person);

    }

    @Test
    public void update() {
        String personId = "00009";
        FourthPerson person = FourthPersonFactory.getPerson("Henry", "Keown", personId);
        person = repository.update(person);
        Assert.assertEquals("00009", person.personId());
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
        Set<FourthPerson> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}