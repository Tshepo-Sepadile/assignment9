package ac.za.cput.controller.people;

import ac.za.cput.domain.FourthPerson;
import ac.za.cput.service.FourthPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class FourthPersonController {

    @Autowired
    @Qualifier("ServiceImpl")
    private FourthPersonService service;

    @PostMapping("/create")
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

    @PostMapping("/delete{personId}")
    @ResponseBody
    public void delete(@PathVariable String personId)
    {
        service.delete(personId);
    }

    @PostMapping("/read{personId}")
    @ResponseBody
    public FourthPerson read(@PathVariable String personId)
    {
        return service.read(personId);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<FourthPerson> getAll()
    {
        return service.getAll();
    }
}
