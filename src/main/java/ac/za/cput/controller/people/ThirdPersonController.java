package ac.za.cput.controller.people;

import ac.za.cput.domain.ThirdPerson;
import ac.za.cput.service.ThirdPersonService;
import ac.za.cput.service.impl.ThirdPersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("password/thirdPerson")
public class ThirdPersonController {

    @Autowired
    private ThirdPersonServiceImpl personService;

    @PostMapping("/create")
    @ResponseBody
    public ThirdPerson create(ThirdPerson person) {
        personService.create(new ThirdPerson.Builder().personId(person.personId()).name(person.personName()).surname(person.personSurname()).build());
        return personService.create(person);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<ThirdPerson> getAll() {
        return personService.getAll();
    }
}
