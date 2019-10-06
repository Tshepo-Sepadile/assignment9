package ac.za.cput.controller.people;

import ac.za.cput.domain.Person;
import ac.za.cput.factory.PersonFactory;
import ac.za.cput.service.PersonService;
import ac.za.cput.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("password/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl personService;

    @PostMapping("/create")
    @ResponseBody
    public Person create(Person person)
    {
        personService.create(new Person.Builder().personId(person.personId()).name(person.personName()).surname(person.personSurname()).build());
        return personService.create(person);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Person> getAll()
    {
        return personService.getAll();
    }

    /*
    @PostMapping("/create")
    @ResponseBody
    public Person create(@RequestBody Person person)
    {
       return service.create(person);
    }

    @GetMapping("/read/{s}")
    @ResponseBody
    public Person read(@PathVariable String s)
    {
        return service.read(s);
    }

    @PostMapping("/update")
    @ResponseBody
    public Person update(@RequestBody Person person)
    {
        return service.update(person);
    }

    @GetMapping("/delete/{s}")
    @ResponseBody
    public void delete(@PathVariable String s)
    {
        service.delete(s);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Person> getAll()
    {
        return service.getAll();
    }*/
}
