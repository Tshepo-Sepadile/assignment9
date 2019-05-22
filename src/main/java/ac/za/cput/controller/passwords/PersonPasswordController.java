package ac.za.cput.controller.passwords;

import ac.za.cput.domain.PersonPassword;
import ac.za.cput.service.PersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class PersonPasswordController {

    @Autowired
    @Qualifier("ServiceImpl")
    private PersonPasswordService service;

    @PostMapping("/create")
    @ResponseBody
    public PersonPassword create(PersonPassword personPassword)
    {
        return service.create(personPassword);
    }

    @PostMapping("/update")
    @ResponseBody
    public PersonPassword update(PersonPassword personPassword)
    {
        return service.update(personPassword);
    }

    @PostMapping("/delete{personPassword}")
    @ResponseBody
    public void delete(@PathVariable String personPassword)
    {
        service.delete(personPassword);
    }

    @PostMapping("/read{personPassword}")
    @ResponseBody
    public PersonPassword read(@PathVariable String personPassword)
    {
        return service.read(personPassword);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<PersonPassword> getAll()
    {
        return service.getAll();
    }
}
