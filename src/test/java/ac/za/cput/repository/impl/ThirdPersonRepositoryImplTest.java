package ac.za.cput.repository.impl;

import ac.za.cput.domain.ThirdPerson;
import ac.za.cput.factory.ThirdPersonFactory;
import ac.za.cput.repository.ThirdPersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ThirdPersonRepositoryImplTest {

    private ThirdPersonRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = ThirdPersonRepositoryImpl.getRepository();
    }


    @Test
    public void create() {
        ThirdPerson person = ThirdPersonFactory.getPerson("Nkosinathi","Sola","00003");
        repository.create(person);
        Assert.assertEquals(1, repository.getAll().size());
    }

    @Test
    public void read() {
        ThirdPerson person = ThirdPersonFactory.getPerson("Nkosinathi", "Sola", "00003");
        person = repository.create(person);
        Assert.assertNotNull(person);

    }

    @Test
    public void update() {
        String personId = "00008";
        ThirdPerson person = ThirdPersonFactory.getPerson("Nkosinathi", "Sola", personId);
        person = repository.update(person);
        Assert.assertEquals("00008", person.personId());
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
        Set<ThirdPerson> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}