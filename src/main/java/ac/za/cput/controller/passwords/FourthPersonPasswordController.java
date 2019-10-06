/*
package ac.za.cput.controller.passwords;

import ac.za.cput.domain.FourthPersonPassword;
import ac.za.cput.service.FourthPersonPasswordService;
import ac.za.cput.service.impl.FourthPersonPasswordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/fourthPersonPassword")
public class FourthPersonPasswordController {

    @Autowired
    private FourthPersonPasswordServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public FourthPersonPassword create(FourthPersonPassword fourthPersonPassword)
    {
        return service.create(fourthPersonPassword);
    }

    @PostMapping("/update")
    @ResponseBody
    public FourthPersonPassword update(FourthPersonPassword fourthPersonPassword)
    {
        return service.update(fourthPersonPassword);
    }

    @GetMapping("/delete/{fourthPersonPassword}")
    @ResponseBody
    public void delete(@PathVariable String fourthPersonPassword)
    {
        service.delete(fourthPersonPassword);
    }

    @GetMapping("/read/{fourthPersonPassword}")
    @ResponseBody
    public FourthPersonPassword read(@PathVariable String fourthPersonPassword)
    {
        return service.read(fourthPersonPassword);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<FourthPersonPassword> getAll()
    {
        return service.getAll();
    }
}
*/
