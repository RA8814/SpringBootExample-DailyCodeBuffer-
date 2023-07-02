package com.dailycodebuffer.springbootexample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

//    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to Daily Code Buffer's Tutorial! \n" +
                "If you want to access the DepartmentController, use /department in the url.\n "+ "" +
                "or /h2-console for the h2 database";
    }
}
