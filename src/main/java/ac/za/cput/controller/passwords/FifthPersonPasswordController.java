package ac.za.cput.controller.passwords;

import ac.za.cput.domain.FifthPersonPassword;
import ac.za.cput.service.FifthPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class FifthPersonPasswordController {

    @Autowired
    @Qualifier("ServiceImpl")
    private FifthPersonPasswordService service;

    @PostMapping("/create")
    @ResponseBody
    public FifthPersonPassword create(FifthPersonPassword personPassword)
    {
        return service.create(personPassword);
    }

    @PostMapping("/update")
    @ResponseBody
    public FifthPersonPassword update(FifthPersonPassword personPassword)
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
    public FifthPersonPassword read(@PathVariable String personPassword)
    {
        return service.read(personPassword);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<FifthPersonPassword> getAll()
    {
        return service.getAll();
    }
}
