package ac.za.cput.service.impl;

import ac.za.cput.domain.FourthPersonPassword;
import ac.za.cput.factory.FourthPersonPasswordFactory;
import ac.za.cput.repository.FourthPersonPasswordRepository;
import ac.za.cput.service.FourthPersonPasswordService;
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

public class FourthPersonPasswordServiceImplTest {

    @Autowired
    private FourthPersonPasswordService service;

    @Test
    public void a_create() {

        FourthPersonPassword personPassword = FourthPersonPasswordFactory.getFourthPersonPassword("00001");
        personPassword = service.create(personPassword);
        Assert.assertEquals("00001", personPassword.password());
    }

    @Test
    public void c_update() {

        String password = "00006";
        FourthPersonPassword personPassword = FourthPersonPasswordFactory.getFourthPersonPassword(password);
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

        FourthPersonPassword personPassword = FourthPersonPasswordFactory.getFourthPersonPassword("00001");
        personPassword = service.create(personPassword);
        Assert.assertNotNull(personPassword);
    }

    @Test
    public void d_getAll() {

        a_create(); //Comment the create method out when you run all tests at once
        List<FourthPersonPassword> persons = this.service.getAll();
        Assert.assertEquals(1, persons.size());
    }
}