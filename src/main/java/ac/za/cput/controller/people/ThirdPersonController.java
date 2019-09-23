package ac.za.cput.controller.people;

import ac.za.cput.domain.ThirdPerson;
import ac.za.cput.service.ThirdPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("password/thirdPerson")
public class ThirdPersonController {

    @Autowired
    private ThirdPersonService service;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
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

    @GetMapping("/delete/{personId}")
    @ResponseBody
    public void delete(@PathVariable String personId)
    {
        service.delete(personId);
    }

    @GetMapping("/read/{personId}")
    @ResponseBody
    public ThirdPerson read(@PathVariable String personId)
    {
        return service.read(personId);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ThirdPerson> getAll()
    {
        return service.getAll();
    }
}
