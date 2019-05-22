package ac.za.cput.controller.people;

import static org.junit.Assert.*;
import ac.za.cput.domain.FourthPerson;
import ac.za.cput.factory.FourthPersonFactory;
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
public class FourthPersonControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/fourthperson";

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
        FourthPerson person = restTemplate.getForObject(baseURL + "/person/1", FourthPerson.class);
        System.out.println(person.personName());
        assertNotNull(person);
    }

    @Test
    public void testCreatePerson()
    {
        FourthPerson person = FourthPersonFactory.getPerson("Tshepo", "Sepadile", "36594");
        ResponseEntity<FourthPerson> postResponse = restTemplate.postForEntity(baseURL + "/create", person, FourthPerson.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void testUpdatePerson()
    {
        String personId = "89987";
        FourthPerson person = restTemplate.getForObject(baseURL + "/person" + personId, FourthPerson.class);
        restTemplate.put(baseURL + "/persons" + personId, person);
        FourthPerson updatedPerson = restTemplate.getForObject(baseURL + "/Person/" + personId, FourthPerson.class);
        assertNotNull(updatedPerson);
    }

    @Test
    public void testDeletePerson()
    {
        String personId = "58845";
        FourthPerson person = restTemplate.getForObject(baseURL + "/persons/" + personId, FourthPerson.class);
        assertNotNull(person);
        try
        {
            person = restTemplate.getForObject(baseURL + "/persons/" + personId, FourthPerson.class);
        }
        catch(final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

}