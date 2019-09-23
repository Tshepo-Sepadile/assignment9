package ac.za.cput.controller.passwords;

import ac.za.cput.domain.ThirdPersonPassword;
import ac.za.cput.service.ThirdPersonPasswordService;
import ac.za.cput.service.impl.ThirdPersonPasswordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/thirdPersonPassword")
public class ThirdPersonPasswordController {

    @Autowired
    private ThirdPersonPasswordServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public ThirdPersonPassword create(ThirdPersonPassword thirdPersonPassword)
    {
        return service.create(thirdPersonPassword);
    }

    @PostMapping("/update")
    @ResponseBody
    public ThirdPersonPassword update(ThirdPersonPassword thirdPersonPassword)
    {
        return service.update(thirdPersonPassword);
    }

    @GetMapping("/delete/{thirdPersonPassword}")
    @ResponseBody
    public void delete(@PathVariable String thirdPersonPassword)
    {
        service.delete(thirdPersonPassword);
    }

    @GetMapping("/read/{personPassword}")
    @ResponseBody
    public ThirdPersonPassword read(@PathVariable String thirdPersonPassword)
    {
        return service.read(thirdPersonPassword);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ThirdPersonPassword> getAll()
    {
        return service.getAll();
    }
}
