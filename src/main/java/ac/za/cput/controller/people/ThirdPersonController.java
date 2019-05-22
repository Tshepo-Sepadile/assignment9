package ac.za.cput.controller.people;

import ac.za.cput.domain.ThirdPerson;
import ac.za.cput.service.ThirdPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class ThirdPersonController {

    @Autowired
    @Qualifier("ServiceImpl")
    private ThirdPersonService service;

    @PostMapping("/create")
    @ResponseBody
    public ThirdPerson create(ThirdPerson person)
    {
        return service.create(person);
    }

    @PostMapping("/update")
    @ResponseBody
    public ThirdPerson update(ThirdPerson person)
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
    public ThirdPerson read(@PathVariable String personId)
    {
        return service.read(personId);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<ThirdPerson> getAll()
    {
        return service.getAll();
    }
}
