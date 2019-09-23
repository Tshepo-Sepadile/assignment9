package ac.za.cput.controller.people;

import ac.za.cput.domain.SecondPerson;
import ac.za.cput.service.SecondPersonService;
import ac.za.cput.service.impl.SecondPersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("passord/secondPerson")
public class SecondPersonController {

    @Autowired
    private SecondPersonServiceImpl service;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SecondPerson create(SecondPerson person)
    {
        return service.create(person);
    }

    @PostMapping("/update")
    @ResponseBody
    public SecondPerson update(SecondPerson person)
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
    public SecondPerson read(@PathVariable String personId)
    {
        return service.read(personId);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<SecondPerson> getAll()
    {
        return service.getAll();
    }
}
