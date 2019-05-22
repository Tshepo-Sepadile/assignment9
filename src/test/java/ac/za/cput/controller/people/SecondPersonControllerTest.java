package ac.za.cput.controller.people;

import static org.junit.Assert.*;
import ac.za.cput.domain.SecondPerson;
import ac.za.cput.factory.SecondPersonFactory;
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
public class SecondPersonControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/secondperson";

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
        SecondPerson person = restTemplate.getForObject(baseURL + "/person/1", SecondPerson.class);
        System.out.println(person.personName());
        assertNotNull(person);
    }

    @Test
    public void testCreatePerson()
    {
        SecondPerson person = SecondPersonFactory.getPerson("Tshepo", "Sepadile", "36594");
        ResponseEntity<SecondPerson> postResponse = restTemplate.postForEntity(baseURL + "/create", person, SecondPerson.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void testUpdatePerson()
    {
        String personId = "89987";
        SecondPerson person = restTemplate.getForObject(baseURL + "/person" + personId, SecondPerson.class);
        restTemplate.put(baseURL + "/persons" + personId, person);
        SecondPerson updatedPerson = restTemplate.getForObject(baseURL + "/Person/" + personId, SecondPerson.class);
        assertNotNull(updatedPerson);
    }

    @Test
    public void testDeletePerson()
    {
        String personId = "58845";
        SecondPerson person = restTemplate.getForObject(baseURL + "/persons/" + personId, SecondPerson.class);
        assertNotNull(person);
        try
        {
            person = restTemplate.getForObject(baseURL + "/persons/" + personId, SecondPerson.class);
        }
        catch(final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

}