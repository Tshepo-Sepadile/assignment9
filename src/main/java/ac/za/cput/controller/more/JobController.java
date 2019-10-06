/*
package ac.za.cput.controller.more;

import ac.za.cput.domain.Job;
import ac.za.cput.service.JobService;
import ac.za.cput.service.impl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobServiceImpl service;

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

    @GetMapping("/delete/{jobTitle}")
    @ResponseBody
    public void delete(@PathVariable String jobTitle)
    {
        service.delete(jobTitle);
    }

    @GetMapping("/read/{jobTitle}")
    @ResponseBody
    public Job read(@PathVariable String jobTitle)
    {
        return service.read(jobTitle);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Job> getAll()
    {
        return service.getAll();
    }
}
*/
