package ac.za.cput.service.impl;

import ac.za.cput.domain.FifthPersonPassword;
import ac.za.cput.factory.FifthPersonPasswordFactory;
import ac.za.cput.repository.FifthPersonPasswordRepository;
import ac.za.cput.repository.impl.FifthPersonPasswordRepositoryImpl;
import ac.za.cput.service.FifthPersonPasswordService;
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

public class FifthPersonPasswordServiceImplTest {

    @Autowired
    private FifthPersonPasswordService service;

    @Test
    public void a_create() {

        FifthPersonPassword personPassword = FifthPersonPasswordFactory.getFifthPersonPassword("00001");
        personPassword = service.create(personPassword);
        Assert.assertEquals("00001", personPassword.password());
    }

    @Test
    public void c_update() {

        String password = "00006";
        FifthPersonPassword personPassword = FifthPersonPasswordFactory.getFifthPersonPassword(password);
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

        FifthPersonPassword personPassword = FifthPersonPasswordFactory.getFifthPersonPassword("00001");
        personPassword = service.create(personPassword);
        Assert.assertNotNull(personPassword);
    }

    @Test
    public void d_getAll() {

        a_create(); //Comment the create method out when you run all tests at once
        Set<FifthPersonPassword> persons = this.service.getAll();
        Assert.assertEquals(1, persons.size());
    }
}