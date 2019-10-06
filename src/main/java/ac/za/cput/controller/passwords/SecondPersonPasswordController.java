/*
package ac.za.cput.controller.passwords;

import ac.za.cput.domain.SecondPersonPassword;
import ac.za.cput.service.SecondPersonPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/secondPersonPassword")
public class SecondPersonPasswordController {

    @Autowired
    private SecondPersonPasswordService service;

    @PostMapping("/create")
    @ResponseBody
    public SecondPersonPassword create(SecondPersonPassword secondPersonPassword)
    {
        return service.create(secondPersonPassword);
    }

    @PostMapping("/update")
    @ResponseBody
    public SecondPersonPassword update(SecondPersonPassword secondPersonPassword)
    {
        return service.update(secondPersonPassword);
    }

    @GetMapping("/delete/{secondPersonPassword}")
    @ResponseBody
    public void delete(@PathVariable String secondPersonPassword)
    {
        service.delete(secondPersonPassword);
    }

    @GetMapping("/read/{personPassword}")
    @ResponseBody
    public SecondPersonPassword read(@PathVariable String secondPersonPassword)
    {
        return service.read(secondPersonPassword);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<SecondPersonPassword> getAll()
    {
        return service.getAll();
    }
}
*/
