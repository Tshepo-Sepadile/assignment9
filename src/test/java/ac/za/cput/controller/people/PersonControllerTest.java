package ac.za.cput.controller.people;

import static org.junit.Assert.*;
import ac.za.cput.domain.Person;
import ac.za.cput.factory.PersonFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
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
public class PersonControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/person";

    @Test
    public void testGetAllPersons()
    {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Test
    public void testGetPersonById()
    {
        Person person = restTemplate.getForObject(baseURL + "/person/1", Person.class);
        System.out.println(person.personName());
        assertNotNull(person);
    }

    @Test
    public void testCreatePerson()
    {
        Person person = PersonFactory.getPerson("Tshepo", "Sepadile", "36594");
        ResponseEntity<Person> postResponse = restTemplate.postForEntity(baseURL + "/create", person, Person.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void testUpdatePerson()
    {
        String personId = "89987";
        Person person = restTemplate.getForObject(baseURL + "/person" + personId, Person.class);
        restTemplate.put(baseURL + "/persons" + personId, person);
        Person updatedPerson = restTemplate.getForObject(baseURL + "/Person/" + personId, Person.class);
        assertNotNull(updatedPerson);
    }

    @Test
    public void testDeletePerson()
    {
        String personId = "58845";
        Person person = restTemplate.getForObject(baseURL + "/persons/" + personId, Person.class);
        assertNotNull(person);
        try
        {
            person = restTemplate.getForObject(baseURL + "/persons/" + personId, Person.class);
        }
        catch(final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

}