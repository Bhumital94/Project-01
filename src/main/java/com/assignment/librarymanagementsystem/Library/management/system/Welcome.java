package com.assignment.librarymanagementsystem.Library.management.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/greet")
    public String getMessage(){
        return "Welcome to Springboot Application";
    }

}
