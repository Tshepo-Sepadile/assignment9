package ac.za.cput.controller.more;

import ac.za.cput.domain.Job;
import ac.za.cput.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class JobController {

    @Autowired
    @Qualifier("ServiceImpl")
    private JobService service;

    @PostMapping("/create")
    @ResponseBody
    public Job create(Job job)
    {
        return service.create(job);
    }

    @PostMapping("/update")
    @ResponseBody
    public Job update(Job job)
    {
        return service.update(job);
    }

    @PostMapping("/delete{jobTitle}")
    @ResponseBody
    public void delete(@PathVariable String jobTitle)
    {
        service.delete(jobTitle);
    }

    @PostMapping("/read{jobTitle}")
    @ResponseBody
    public Job read(@PathVariable String jobTitle)
    {
        return service.read(jobTitle);
    }

    @PostMapping("/read/all")
    @ResponseBody
    public Set<Job> getAll()
    {
        return service.getAll();
    }
}
