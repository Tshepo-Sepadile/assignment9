package ac.za.cput.controller.passwords;

import ac.za.cput.domain.FourthPersonPassword;
import ac.za.cput.service.FourthPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class FourthPersonPasswordController {

    @Autowired
    @Qualifier("ServiceImpl")
    private FourthPersonPasswordService service;

    @PostMapping("/create")
    @ResponseBody
    public FourthPersonPassword create(FourthPersonPassword personPassword)
    {
        return service.create(personPassword);
    }

    @PostMapping("/update")
    @ResponseBody
    public FourthPersonPassword update(FourthPersonPassword personPassword)
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
    public FourthPersonPassword read(@PathVariable String personPassword)
    {
        return service.read(personPassword);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<FourthPersonPassword> getAll()
    {
        return service.getAll();
    }
}
