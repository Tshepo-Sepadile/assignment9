
package ac.za.cput.controller.people;

import ac.za.cput.domain.FifthPerson;
import ac.za.cput.service.FifthPersonService;
import ac.za.cput.service.impl.FifthPersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("password/fifthPerson")
public class FifthPersonController {

    @Autowired
    private FifthPersonServiceImpl personService;

    @PostMapping("/create")
    @ResponseBody
    public FifthPerson create(FifthPerson person)
    {
        personService.create(new FifthPerson.Builder().personId(person.personId()).name(person.personName()).surname(person.personSurname()).build());
        return personService.create(person);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<FifthPerson> getAll()
    {
        return personService.getAll();
    }
}

