package ac.za.cput.controller.people;

import ac.za.cput.domain.FifthPerson;
import ac.za.cput.service.FifthPersonService;
import ac.za.cput.service.impl.FifthPersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("password/fifthPerson")
public class FifthPersonController {

    @Autowired
    private FifthPersonServiceImpl service;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public FifthPerson create(FifthPerson person)
    {
        return service.create(person);
    }

    @PostMapping("/update")
    @ResponseBody
    public FifthPerson update(FifthPerson person)
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
    public FifthPerson read(@PathVariable String personId)
    {
        return service.read(personId);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<FifthPerson> getAll()
    {
        return service.getAll();
    }
}
