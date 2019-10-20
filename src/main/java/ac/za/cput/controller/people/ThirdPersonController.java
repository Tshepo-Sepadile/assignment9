package ac.za.cput.controller.people;

import ac.za.cput.domain.ThirdPerson;
import ac.za.cput.factory.ThirdPersonFactory;
import ac.za.cput.service.ThirdPersonService;
import ac.za.cput.service.impl.ThirdPersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/thirdPerson")
public class ThirdPersonController {

    @Autowired
    private ThirdPersonServiceImpl thirdPersonService;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ThirdPerson create(ThirdPerson thirdPerson)
    {
        ThirdPerson psn = ThirdPersonFactory.getPerson(thirdPerson.personName(), thirdPerson.personSurname(), thirdPerson.personId());
        return thirdPersonService.create(psn);
    }

    @GetMapping(path = "/read/{personId}")
    public ThirdPerson read(@PathVariable String personId)
    {
        return this.thirdPersonService.read(personId);
    }

    @PutMapping("/update")
    public ThirdPerson update(@RequestBody ThirdPerson thirdPerson)
    {
        return this.thirdPersonService.update(thirdPerson);
    }

    @DeleteMapping(path = "/delete/{personId}")
    public void delete(@PathVariable String personId)
    {
        thirdPersonService.delete(personId);
    }

    @GetMapping("/getall")
    public List<ThirdPerson> getAll()
    {
        List<ThirdPerson> persons = thirdPersonService.getAll();
        return persons;
    }

}
