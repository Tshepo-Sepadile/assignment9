/*
package ac.za.cput.repository.impl;

import ac.za.cput.domain.FifthPerson;
import ac.za.cput.factory.FifthPersonFactory;
import ac.za.cput.repository.FifthPersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class FifthPersonRepositoryImplTest {

    private FifthPersonRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = FifthPersonRepositoryImpl.getRepository();
    }


    @Test
    public void a_create() {
        FifthPerson person = FifthPersonFactory.getPerson("Beauty","Fool","00005");
        repository.create(person);
        Assert.assertEquals(1, repository.getAll().size());
    }

    @Test
    public void b_read() {
        FifthPerson person = FifthPersonFactory.getPerson("Beauty", "Fool", "00005");
        person = repository.create(person);
        Assert.assertNotNull(person);

    }

    @Test
    public void c_update() {
        String personId = "000010";
        FifthPerson person = FifthPersonFactory.getPerson("Beauty", "Fool", personId);
        person = repository.update(person);
        Assert.assertEquals("000010", person.personId());
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
        Set<FifthPerson> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}
*/
