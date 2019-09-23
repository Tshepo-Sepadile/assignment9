package ac.za.cput.controller.more;

import ac.za.cput.domain.Occupation;
import ac.za.cput.service.OccupationService;
import ac.za.cput.service.impl.OccupationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/occupation")
public class OccupationController {

    @Autowired
    private OccupationServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public Occupation create(Occupation occupation)
    {
        return service.create(occupation);
    }

    @PostMapping("/update")
    @ResponseBody
    public Occupation update(Occupation occupation)
    {
        return service.update(occupation);
    }

    @GetMapping("/delete/{occupationId}")
    @ResponseBody
    public void delete(@PathVariable String occupationId)
    {
        service.delete(occupationId);
    }

    @GetMapping("/read/{occupationId}")
    @ResponseBody
    public Occupation read(@PathVariable String occupationId)
    {
        return service.read(occupationId);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Occupation> getAll()
    {
        return service.getAll();
    }
}
