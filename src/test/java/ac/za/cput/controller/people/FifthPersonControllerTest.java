package ac.za.cput.controller.people;

import static org.junit.Assert.*;
import ac.za.cput.domain.FifthPerson;
import ac.za.cput.factory.FifthPersonFactory;
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
public class FifthPersonControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/fifthperson";

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
        FifthPerson person = restTemplate.getForObject(baseURL + "/person/1", FifthPerson.class);
        System.out.println(person.personName());
        assertNotNull(person);
    }

    @Test
    public void testCreatePerson()
    {
        FifthPerson person = FifthPersonFactory.getPerson("Tshepo", "Sepadile", "36594");
        ResponseEntity<FifthPerson> postResponse = restTemplate.postForEntity(baseURL + "/create", person, FifthPerson.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void testUpdatePerson()
    {
        String personId = "89987";
        FifthPerson person = restTemplate.getForObject(baseURL + "/person" + personId, FifthPerson.class);
        restTemplate.put(baseURL + "/persons" + personId, person);
        FifthPerson updatedPerson = restTemplate.getForObject(baseURL + "/Person/" + personId, FifthPerson.class);
        assertNotNull(updatedPerson);
    }

    @Test
    public void testDeletePerson()
    {
        String personId = "58845";
        FifthPerson person = restTemplate.getForObject(baseURL + "/persons/" + personId, FifthPerson.class);
        assertNotNull(person);
        try
        {
            person = restTemplate.getForObject(baseURL + "/persons/" + personId, FifthPerson.class);
        }
        catch(final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

}