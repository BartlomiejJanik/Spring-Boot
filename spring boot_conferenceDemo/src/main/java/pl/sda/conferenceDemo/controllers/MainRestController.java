package pl.sda.conferenceDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @GetMapping("/rest")
    public String getMessage(){
        return "{message:\"Hello Spring Boot\"}";
    }

}
