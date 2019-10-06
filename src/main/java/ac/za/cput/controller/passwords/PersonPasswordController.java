/*
package ac.za.cput.controller.passwords;

import ac.za.cput.domain.PersonPassword;
import ac.za.cput.service.PersonPasswordService;
import ac.za.cput.service.impl.PersonPasswordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/personPassword")
public class PersonPasswordController {

    @Autowired
    private PersonPasswordServiceImpl service;

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

    @GetMapping("/delete/{personPassword}")
    @ResponseBody
    public void delete(@PathVariable String personPassword)
    {
        service.delete(personPassword);
    }

    @GetMapping("/read/{personPassword}")
    @ResponseBody
    public PersonPassword read(@PathVariable String personPassword)
    {
        return service.read(personPassword);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PersonPassword> getAll()
    {
        return service.getAll();
    }
}
*/
