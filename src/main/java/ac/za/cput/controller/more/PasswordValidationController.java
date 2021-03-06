/*
package ac.za.cput.controller.more;

import ac.za.cput.domain.PasswordValidation;
import ac.za.cput.service.PasswordValidationService;
import ac.za.cput.service.impl.PasswordValidationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/passwordValidation")
public class PasswordValidationController {

    @Autowired
    private PasswordValidationServiceImpl service;

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

    @GetMapping("/delete/{passVal}")
    @ResponseBody
    public void delete(@PathVariable String passVal)
    {
        service.delete(passVal);
    }

    @GetMapping("/read/{passVal}")
    @ResponseBody
    public PasswordValidation read(@PathVariable String passVal)
    {
        return service.read(passVal);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PasswordValidation> getAll()
    {
        return service.getAll();
    }
}*/
