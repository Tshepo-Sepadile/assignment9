package ac.za.cput.controller.passwords;

import ac.za.cput.domain.SecondPersonPassword;
import ac.za.cput.service.SecondPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class SecondPersonPasswordController {

    @Autowired
    @Qualifier("ServiceImpl")
    private SecondPersonPasswordService service;

    @PostMapping("/create")
    @ResponseBody
    public SecondPersonPassword create(SecondPersonPassword personPassword)
    {
        return service.create(personPassword);
    }

    @PostMapping("/update")
    @ResponseBody
    public SecondPersonPassword update(SecondPersonPassword personPassword)
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
    public SecondPersonPassword read(@PathVariable String personPassword)
    {
        return service.read(personPassword);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<SecondPersonPassword> getAll()
    {
        return service.getAll();
    }
}
