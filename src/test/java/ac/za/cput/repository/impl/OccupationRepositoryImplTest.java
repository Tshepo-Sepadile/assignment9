package ac.za.cput.repository.impl;

import ac.za.cput.domain.Occupation;
import ac.za.cput.factory.OccupationFactory;
import ac.za.cput.repository.OccupationRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class OccupationRepositoryImplTest {

    private OccupationRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = OccupationRepositoryImpl.getRepository();
    }


    @Test
    public void create() {
        Occupation occupation = OccupationFactory.getOccupation("0011");
        repository.create(occupation);
        Assert.assertEquals(1, repository.getAll().size());
    }

    @Test
    public void read() {
        Occupation occupation = OccupationFactory.getOccupation("0011");
        occupation = repository.create(occupation);
        Assert.assertNotNull(occupation);

    }

    @Test
    public void update() {
        String occupationID = "0111";
        Occupation occupation = OccupationFactory.getOccupation(occupationID);
        occupation = repository.update(occupation);
        Assert.assertEquals("0111", occupation.occupationIdentity());
    }

    @Test
    public void delete() {
        String occupationID = "0011";
        repository.delete(occupationID);
        assertNull(repository.read(occupationID));
    }

    @Test
    public void getAll() {
        //create(); //Comment the create method out when you run all tests at once
        Set<Occupation> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}