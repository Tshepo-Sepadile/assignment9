package ac.za.cput.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = {"/", "/password"})
    @ResponseBody
    public ResponseEntity<String> getHome()
    {
        return new ResponseEntity<>("Hello, welcome to Password Manager", HttpStatus.OK);
    }

}
