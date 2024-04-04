package com.example.workshops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/hello")bkhjhjkhjhjjk
    public String hello() {
        return "Hello world!";
    }

}
