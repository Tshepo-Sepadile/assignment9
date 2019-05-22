package ac.za.cput.controller.people;

import ac.za.cput.domain.FifthPerson;
import ac.za.cput.service.FifthPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class FifthPersonController {

    @Autowired
    @Qualifier("ServiceImpl")
    private FifthPersonService service;

    @PostMapping("/create")
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

    @PostMapping("/delete{personId}")
    @ResponseBody
    public void delete(@PathVariable String personId)
    {
        service.delete(personId);
    }

    @PostMapping("/read{personId}")
    @ResponseBody
    public FifthPerson read(@PathVariable String personId)
    {
        return service.read(personId);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<FifthPerson> getAll()
    {
        return service.getAll();
    }
}
