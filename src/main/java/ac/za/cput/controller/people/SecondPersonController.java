package ac.za.cput.controller.people;

import ac.za.cput.domain.SecondPerson;
import ac.za.cput.service.SecondPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class SecondPersonController {

    @Autowired
    @Qualifier("ServiceImpl")
    private SecondPersonService service;

    @PostMapping("/create")
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

    @PostMapping("/delete{personId}")
    @ResponseBody
    public void delete(@PathVariable String personId)
    {
        service.delete(personId);
    }

    @PostMapping("/read{personId}")
    @ResponseBody
    public SecondPerson read(@PathVariable String personId)
    {
        return service.read(personId);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<SecondPerson> getAll()
    {
        return service.getAll();
    }
}
