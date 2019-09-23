package ac.za.cput.controller.people;

import ac.za.cput.domain.FourthPerson;
import ac.za.cput.service.FourthPersonService;
import ac.za.cput.service.impl.FourthPersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("password/fourthPerson")
public class FourthPersonController {

    @Autowired
    private FourthPersonServiceImpl service;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public FourthPerson create(FourthPerson person)
    {
        return service.create(person);
    }

    @PostMapping("/update")
    @ResponseBody
    public FourthPerson update(FourthPerson person)
    {
        return service.update(person);
    }

    @GetMapping("/delete/{personId}")
    @ResponseBody
    public void delete(@PathVariable String personId)
    {
        service.delete(personId);
    }

    @GetMapping("/read/{personId}")
    @ResponseBody
    public FourthPerson read(@PathVariable String personId)
    {
        return service.read(personId);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<FourthPerson> getAll()
    {
        return service.getAll();
    }
}
