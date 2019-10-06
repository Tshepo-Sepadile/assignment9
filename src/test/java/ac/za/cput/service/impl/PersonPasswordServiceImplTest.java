package ac.za.cput.service.impl;

import ac.za.cput.domain.PersonPassword;
import ac.za.cput.factory.PersonPasswordFactory;
import ac.za.cput.repository.PersonPasswordRepository;
import ac.za.cput.service.PersonPasswordService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PersonPasswordServiceImplTest {

    @Autowired
    private PersonPasswordService service;

    @Test
    public void a_create() {

        PersonPassword personPassword = PersonPasswordFactory.getPersonPassword("00001");
        personPassword = service.create(personPassword);
        Assert.assertEquals("00001", personPassword.password());
    }

    @Test
    public void c_update() {

        String password = "00006";
        PersonPassword personPassword = PersonPasswordFactory.getPersonPassword(password);
        personPassword = service.update(personPassword);
        Assert.assertEquals("00006", personPassword.password());


    }

    @Test
    public void e_delete() {

        String password = "00001";
        service.delete(password);
        assertNull(service.read(password));
    }

    @Test
    public void b_read() {

        PersonPassword personPassword = PersonPasswordFactory.getPersonPassword("00001");
        personPassword = service.create(personPassword);
        Assert.assertNotNull(personPassword);
    }

    @Test
    public void d_getAll() {

        a_create(); //Comment the create method out when you run all tests at once
        List<PersonPassword> persons = this.service.getAll();
        Assert.assertEquals(1, persons.size());
    }
}