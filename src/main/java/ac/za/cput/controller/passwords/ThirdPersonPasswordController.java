package ac.za.cput.controller.passwords;

import ac.za.cput.domain.ThirdPersonPassword;
import ac.za.cput.service.ThirdPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class ThirdPersonPasswordController {

    @Autowired
    @Qualifier("ServiceImpl")
    private ThirdPersonPasswordService service;

    @PostMapping("/create")
    @ResponseBody
    public ThirdPersonPassword create(ThirdPersonPassword personPassword)
    {
        return service.create(personPassword);
    }

    @PostMapping("/update")
    @ResponseBody
    public ThirdPersonPassword update(ThirdPersonPassword personPassword)
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
    public ThirdPersonPassword read(@PathVariable String personPassword)
    {
        return service.read(personPassword);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<ThirdPersonPassword> getAll()
    {
        return service.getAll();
    }
}
