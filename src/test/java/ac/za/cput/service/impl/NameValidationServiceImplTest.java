package ac.za.cput.service.impl;

import ac.za.cput.domain.NameValidation;
import ac.za.cput.factory.NameValidationFactory;
import ac.za.cput.repository.NameValidationRepository;
import ac.za.cput.repository.impl.NameValidationRepositoryImpl;
import ac.za.cput.service.NameValidationService;
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

public class NameValidationServiceImplTest {

    @Autowired
    private NameValidationService service;

    @Test
    public void a_create() {

        NameValidation nameValidation = NameValidationFactory.getNameValidation("Correct");
        nameValidation = service.create(nameValidation);
        Assert.assertEquals("Correct", nameValidation.validateName());
    }

    @Test
    public void c_update() {

        String nameVal = "Incorrect";
        NameValidation nameValidation = NameValidationFactory.getNameValidation(nameVal);
        nameValidation = service.update(nameValidation);
        Assert.assertEquals("Incorrect", nameValidation.validateName());


    }

    @Test
    public void e_delete() {

        String nameVal = "Correct";
        service.delete(nameVal);
        assertNull(service.read(nameVal));
    }

    @Test
    public void b_read() {

        NameValidation nameValidation = NameValidationFactory.getNameValidation("Correct");
        nameValidation = service.create(nameValidation);
        Assert.assertNotNull(nameValidation);
    }

    @Test
    public void d_getAll() {

        a_create(); //Comment the create method out when you run all tests at once
        Set<NameValidation> persons = this.service.getAll();
        Assert.assertEquals(1, persons.size());
    }
}