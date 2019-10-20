
package ac.za.cput.controller.people;

import ac.za.cput.domain.FifthPerson;
import ac.za.cput.factory.FifthPersonFactory;
import ac.za.cput.service.FifthPersonService;
import ac.za.cput.service.impl.FifthPersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/fifthPerson")
public class FifthPersonController {

    @Autowired
    private FifthPersonServiceImpl fifthPersonService;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public FifthPerson create(FifthPerson fifthPerson)
    {
        FifthPerson psn = FifthPersonFactory.getPerson(fifthPerson.personName(), fifthPerson.personSurname(), fifthPerson.personId());
        return fifthPersonService.create(psn);
    }

    @GetMapping(path = "/read/{personId}")
    public FifthPerson read(@PathVariable String personId)
    {
        return this.fifthPersonService.read(personId);
    }

    @PutMapping("/update")
    public FifthPerson update(@RequestBody FifthPerson fifthPerson)
    {
        return this.fifthPersonService.update(fifthPerson);
    }

    @DeleteMapping(path = "/delete/{personId}")
    public void delete(@PathVariable String personId)
    {
        fifthPersonService.delete(personId);
    }

    @GetMapping("/getall")
    public List<FifthPerson> getAll()
    {
        List<FifthPerson> persons = fifthPersonService.getAll();
        return persons;
    }

}

