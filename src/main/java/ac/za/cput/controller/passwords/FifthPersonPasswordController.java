package ac.za.cput.controller.passwords;

import ac.za.cput.domain.FifthPersonPassword;
import ac.za.cput.service.FifthPersonPasswordService;
import ac.za.cput.service.impl.FifthPersonPasswordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/fifthPersonPassword")
public class FifthPersonPasswordController {

    @Autowired
    private FifthPersonPasswordServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public FifthPersonPassword create(FifthPersonPassword fifthPersonPassword)
    {
        return service.create(fifthPersonPassword);
    }

    @PostMapping("/update")
    @ResponseBody
    public FifthPersonPassword update(FifthPersonPassword fifthPersonPassword)
    {
        return service.update(fifthPersonPassword);
    }

    @GetMapping("/delete/{fifthPersonPassword}")
    @ResponseBody
    public void delete(@PathVariable String fifthPersonPassword)
    {
        service.delete(fifthPersonPassword);
    }

    @GetMapping("/read/{fifthPersonPassword}")
    @ResponseBody
    public FifthPersonPassword read(@PathVariable String fifthPersonPassword)
    {
        return service.read(fifthPersonPassword);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<FifthPersonPassword> getAll()
    {
        return service.getAll();
    }
}
