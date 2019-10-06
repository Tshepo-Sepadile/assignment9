package ac.za.cput.controller.people;

import static org.junit.Assert.*;
import ac.za.cput.domain.Person;
import ac.za.cput.factory.PersonFactory;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/person";

    @Test
    public void a_create()
    {
        Person person = PersonFactory.getPerson("John", "Doe", "12345");
        ResponseEntity<Person> response = restTemplate.postForEntity(baseURL + "/create", person, Person.class);
        assertNotNull(response);
        assertNotNull(response.getBody());
        System.out.println("Name: " + response.getBody().personName() + " " + "Surname: " + response.getBody().personSurname() + " " +  "Person ID: " + response.getBody().personId());
    }

    @Test
    public void b_read()
    {
        Person person = restTemplate.getForObject(baseURL + "/read/12345", Person.class);
        assertNotNull(person);
        System.out.println("Person ID: " + person.personId() + " " + "Name: " + person.personName() + "Surname: " + person.personSurname());
    }

    @Test
    public void c_update()
    {
        String personId = "12345";
        Person person = restTemplate.getForObject(baseURL + "/read/" + personId, Person.class);
        restTemplate.put(baseURL + "/update/" + personId, person);
        Person updatePerson = restTemplate.getForObject(baseURL + "/read/" + personId, Person.class);
        assertNotNull(updatePerson);
        System.out.println(updatePerson.personId() + updatePerson.personName() + updatePerson.personSurname());
    }

    @Test
    public void d_delete()
    {
        String personId = "12345";
        Person person = restTemplate.getForObject(baseURL + "/read/" + personId, Person.class);
        assertNotNull(person);
        System.out.println(person.personId() + person.personName() + person.personSurname());
        restTemplate.getForObject(baseURL + "/read/" + personId, Person.class);
    }

    @Test
    public void e_getAll()
    {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity responseEntity = restTemplate.exchange(baseURL + "/getAll", HttpMethod.GET, entity, String.class);
        assertNotSame(null, responseEntity.getBody());
    }

}