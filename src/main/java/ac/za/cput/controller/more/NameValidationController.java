package ac.za.cput.controller.more;

import ac.za.cput.domain.NameValidation;
import ac.za.cput.service.NameValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class NameValidationController {

    @Autowired
    @Qualifier("ServiceImpl")
    private NameValidationService service;

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

    @PostMapping("/delete{nameVal}")
    @ResponseBody
    public void delete(@PathVariable String nameVal)
    {
        service.delete(nameVal);
    }

    @PostMapping("/read{nameVal}")
    @ResponseBody
    public NameValidation read(@PathVariable String nameVal)
    {
        return service.read(nameVal);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<NameValidation> getAll()
    {
        return service.getAll();
    }
}
