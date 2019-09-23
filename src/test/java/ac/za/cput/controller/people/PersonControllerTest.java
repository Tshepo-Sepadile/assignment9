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
    public void d_getAll()
    {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Test
    public void b_read()
    {
        Person person = restTemplate.getForObject(baseURL + "/read/36594", Person.class);
        assertNotNull(person);
    }

    @Test
    public void a_create()
    {
        Person person = PersonFactory.getPerson("Tshepo", "Sepadile", "36594");
        ResponseEntity<Person> postResponse = restTemplate.postForEntity(baseURL + "/create", person, Person.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void c_update()
    {
        String personId = "36594";
        Person person = restTemplate.getForObject(baseURL + "/read/" + personId, Person.class);
        Person newPerson = PersonFactory.getPerson(person.personName(), "Cena", personId);
        restTemplate.put(baseURL + "/update/" + personId, newPerson);
        Person updatedPerson = restTemplate.getForObject(baseURL + "/read/" + personId, Person.class);
        assertNotNull(updatedPerson);
    }

    @Test
    public void e_delete()
    {
        String personId = "36594";
        Person person = restTemplate.getForObject(baseURL + "/read/" + personId, Person.class);
        assertNotNull(person);
        restTemplate.delete(baseURL + "/delete/" + personId);
        try
        {
            person = restTemplate.getForObject(baseURL + "/read/" + personId, Person.class);
        }
        catch(final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

}