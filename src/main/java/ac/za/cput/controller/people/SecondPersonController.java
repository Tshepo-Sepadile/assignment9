package ac.za.cput.controller.people;

import ac.za.cput.domain.SecondPerson;
import ac.za.cput.service.SecondPersonService;
import ac.za.cput.service.impl.SecondPersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("passord/secondPerson")
public class SecondPersonController {

    @Autowired
    private SecondPersonServiceImpl personService;

    @PostMapping("/create")
    @ResponseBody
    public SecondPerson create(SecondPerson person)
    {
        personService.create(new SecondPerson.Builder().personId(person.personId()).name(person.personName()).surname(person.personSurname()).build());
        return personService.create(person);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<SecondPerson> getAll()
    {
        return personService.getAll();
    }
}

