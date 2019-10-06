/*
package ac.za.cput.controller.more;

import ac.za.cput.domain.NameValidation;
import ac.za.cput.service.NameValidationService;
import ac.za.cput.service.impl.NameValidationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/nameVal")
public class NameValidationController {

    @Autowired
    private NameValidationServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public NameValidation create(NameValidation nameValidation)
    {
        return service.create(nameValidation);
    }

    @PostMapping("/update")
    @ResponseBody
    public NameValidation update(NameValidation nameValidation)
    {
        return service.update(nameValidation);
    }

    @GetMapping("/delete/{nameVal}")
    @ResponseBody
    public void delete(@PathVariable String nameVal)
    {
        service.delete(nameVal);
    }

    @GetMapping("/read/{nameVal}")
    @ResponseBody
    public NameValidation read(@PathVariable String nameVal)
    {
        return service.read(nameVal);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<NameValidation> getAll()
    {
        return service.getAll();
    }
}
*/
