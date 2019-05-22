package ac.za.cput.controller.people;

import ac.za.cput.domain.Person;
import ac.za.cput.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    @Qualifier("ServiceImpl")
    private PersonService service;

    @PostMapping("/create")
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

    @PostMapping("/delete{personId}")
    @ResponseBody
    public void delete(@PathVariable String personId)
    {
       service.delete(personId);
    }

    @PostMapping("/read{personId}")
    @ResponseBody
    public Person read(@PathVariable String personId)
    {
        return service.read(personId);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<Person> getAll()
    {
        return service.getAll();
    }
}
