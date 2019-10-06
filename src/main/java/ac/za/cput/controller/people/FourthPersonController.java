package ac.za.cput.controller.people;

import ac.za.cput.domain.FourthPerson;
import ac.za.cput.service.FourthPersonService;
import ac.za.cput.service.impl.FourthPersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("password/fourthPerson")
public class FourthPersonController {

    @Autowired
    private FourthPersonServiceImpl personService;

    @PostMapping("/create")
    @ResponseBody
    public FourthPerson create(FourthPerson person)
    {
        personService.create(new FourthPerson.Builder().personId(person.personId()).name(person.personName()).surname(person.personSurname()).build());
        return personService.create(person);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<FourthPerson> getAll()
    {
        return personService.getAll();
    }
}

