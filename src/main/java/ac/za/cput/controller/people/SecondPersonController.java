package ac.za.cput.controller.people;

import ac.za.cput.domain.SecondPerson;
import ac.za.cput.factory.SecondPersonFactory;
import ac.za.cput.service.SecondPersonService;
import ac.za.cput.service.impl.SecondPersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/secondPerson")
public class SecondPersonController {

    @Autowired
    private SecondPersonServiceImpl secondPersonService;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public SecondPerson create(SecondPerson secondPerson)
    {
        SecondPerson psn = SecondPersonFactory.getPerson(secondPerson.personName(), secondPerson.personSurname(), secondPerson.personId());
        return secondPersonService.create(psn);
    }

    @GetMapping(path = "/read/{personId}")
    public SecondPerson read(@PathVariable String personId)
    {
        return this.secondPersonService.read(personId);
    }

    @PutMapping("/update")
    public SecondPerson update(@RequestBody SecondPerson secondPerson)
    {
        return this.secondPersonService.update(secondPerson);
    }

    @DeleteMapping(path = "/delete/{personId}")
    public void delete(@PathVariable String personId)
    {
        secondPersonService.delete(personId);
    }

    @GetMapping("/getall")
    public List<SecondPerson> getAll()
    {
        List<SecondPerson> persons = secondPersonService.getAll();
        return persons;
    }

}

