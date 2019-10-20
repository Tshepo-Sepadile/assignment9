package ac.za.cput.controller.people;

import ac.za.cput.domain.FourthPerson;
import ac.za.cput.factory.FourthPersonFactory;
import ac.za.cput.service.FourthPersonService;
import ac.za.cput.service.impl.FourthPersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/fourthPerson")
public class FourthPersonController {

    @Autowired
    private FourthPersonServiceImpl fourthPersonService;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public FourthPerson create(FourthPerson fourthPerson)
    {
        FourthPerson psn = FourthPersonFactory.getPerson(fourthPerson.personName(), fourthPerson.personSurname(), fourthPerson.personId());
        return fourthPersonService.create(psn);
    }

    @GetMapping(path = "/read/{personId}")
    public FourthPerson read(@PathVariable String personId)
    {
        return this.fourthPersonService.read(personId);
    }

    @PutMapping("/update")
    public FourthPerson update(@RequestBody FourthPerson person)
    {
        return this.fourthPersonService.update(person);
    }

    @DeleteMapping(path = "/delete/{personId}")
    public void delete(@PathVariable String personId)
    {
        fourthPersonService.delete(personId);
    }

    @GetMapping("/getall")
    public List<FourthPerson> getAll()
    {
        List<FourthPerson> persons = fourthPersonService.getAll();
        return persons;
    }

}

