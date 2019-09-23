package ac.za.cput.controller.people;

import ac.za.cput.domain.Person;
import ac.za.cput.service.PersonService;
import ac.za.cput.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("password/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl service;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Person create(Person person)
    {
        return service.create(person);
    }

    @PostMapping("/update")
    @ResponseBody
    public Person update(Person person)
    {
        return service.update(person);
    }

    @GetMapping("/delete/{personId}")
    @ResponseBody
    public void delete(@PathVariable String personId)
    {
       service.delete(personId);
    }

    @GetMapping("/read/{personId}")
    @ResponseBody
    public Person read(@PathVariable String personId)
    {
        return service.read(personId);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Person> getAll()
    {
        return service.getAll();
    }
}