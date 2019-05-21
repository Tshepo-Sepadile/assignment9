package ac.za.cput.repository.impl;

import ac.za.cput.domain.NameValidation;
import ac.za.cput.factory.NameValidationFactory;
import ac.za.cput.repository.NameValidationRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class NameValidationRepositoryImplTest {

    private NameValidationRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = NameValidationRepositoryImpl.getRepository();
    }


    @Test
    public void create() {
        NameValidation nameValidation = NameValidationFactory.getNameValidation("Correct");
        repository.create(nameValidation);
        Assert.assertEquals(1, repository.getAll().size());
    }

    @Test
    public void read() {
        NameValidation nameValidation = NameValidationFactory.getNameValidation("Correct");
        nameValidation = repository.create(nameValidation);
        Assert.assertNotNull(nameValidation);

    }

    @Test
    public void update() {
        String nameVal = "Correct";
        NameValidation nameValidation = NameValidationFactory.getNameValidation(nameVal);
        nameValidation = repository.update(nameValidation);
        Assert.assertEquals("Correct", nameValidation.validateName());
    }

    @Test
    public void delete() {
        String name = "Correct";
        repository.delete(name);
        assertNull(repository.read(name));
    }

    @Test
    public void getAll() {
        //create(); //Comment the create method out when you run all tests at once
        Set<NameValidation> persons = this.repository.getAll();
        Assert.assertEquals(1, persons.size());
    }
}