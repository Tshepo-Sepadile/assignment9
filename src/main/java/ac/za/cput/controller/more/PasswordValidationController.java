package ac.za.cput.controller.more;

import ac.za.cput.domain.PasswordValidation;
import ac.za.cput.service.PasswordValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class PasswordValidationController {

    @Autowired
    @Qualifier("ServiceImpl")
    private PasswordValidationService service;

    @PostMapping("/create")
    @ResponseBody
    public PasswordValidation create(PasswordValidation passwordValidation)
    {
        return service.create(passwordValidation);
    }

    @PostMapping("/update")
    @ResponseBody
    public PasswordValidation update(PasswordValidation passwordValidation)
    {
        return service.update(passwordValidation);
    }

    @PostMapping("/delete{passVal}")
    @ResponseBody
    public void delete(@PathVariable String passVal)
    {
        service.delete(passVal);
    }

    @PostMapping("/read{passVal}")
    @ResponseBody
    public PasswordValidation read(@PathVariable String passVal)
    {
        return service.read(passVal);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<PasswordValidation> getAll()
    {
        return service.getAll();
    }
}
