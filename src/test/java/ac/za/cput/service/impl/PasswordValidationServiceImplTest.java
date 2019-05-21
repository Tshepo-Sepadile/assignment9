package ac.za.cput.service.impl;

import ac.za.cput.domain.PasswordValidation;
import ac.za.cput.factory.PasswordValidationFactory;
import ac.za.cput.repository.PasswordValidationRepository;
import ac.za.cput.repository.impl.PasswordValidationRepositoryImpl;
import ac.za.cput.service.PasswordValidationService;
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

public class PasswordValidationServiceImplTest {

    @Autowired
    private PasswordValidationService service;

    @Test
    public void a_create() {

        PasswordValidation passwordValidation = PasswordValidationFactory.getPasswordValidation("Correct");
        passwordValidation = service.create(passwordValidation);
        Assert.assertEquals("Correct", passwordValidation.validatePassword());
    }

    @Test
    public void c_update() {

        String passVal = "Incorrect";
        PasswordValidation passwordValidation = PasswordValidationFactory.getPasswordValidation(passVal);
        passwordValidation = service.update(passwordValidation);
        Assert.assertEquals("Incorrect", passwordValidation.validatePassword());


    }

    @Test
    public void e_delete() {

        String passVal = "Correct";
        service.delete(passVal);
        assertNull(service.read(passVal));
    }

    @Test
    public void b_read() {

        PasswordValidation passwordValidation = PasswordValidationFactory.getPasswordValidation("Correct");
        passwordValidation = service.create(passwordValidation);
        Assert.assertNotNull(passwordValidation);
    }

    @Test
    public void d_getAll() {

        a_create(); //Comment the create method out when you run all tests at once
        Set<PasswordValidation> persons = this.service.getAll();
        Assert.assertEquals(1, persons.size());
    }
}