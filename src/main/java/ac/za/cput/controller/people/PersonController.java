package ac.za.cput.controller.people;

import ac.za.cput.domain.Person;
import ac.za.cput.factory.PersonFactory;
import ac.za.cput.service.PersonService;
import ac.za.cput.service.impl.PersonServiceImpl;
import org.assertj.core.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl personService;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person create(Person person)
    {
        Person psn = PersonFactory.getPerson(person.personName(), person.personSurname(), person.personId());
        return personService.create(psn);
    }

    @GetMapping(path = "/read/{personId}")
    public Person read(@PathVariable String personId)
    {
        return this.personService.read(personId);
    }

    @PutMapping("/update")
    public Person update(@RequestBody Person person)
    {
        return this.personService.update(person);
    }

    @DeleteMapping(path = "/delete/{personId}")
    public void delete(@PathVariable String personId)
    {
        personService.delete(personId);
    }

    @GetMapping("/getall")
    public List<Person> getAll()
    {
        List<Person> persons = personService.getAll();
        return persons;
    }


}
