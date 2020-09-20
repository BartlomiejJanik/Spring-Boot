package pl.sda.conferenceDemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.conferenceDemo.models.Speaker;
import pl.sda.conferenceDemo.services.SpeakerService;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class MainRestController {

    private SpeakerService speakerService;

    @Autowired
    public MainRestController(SpeakerService speakerService) {
        this.speakerService = speakerService;
    }

    @GetMapping("")
    public String getMessage(){
        return "{message:\"Hello Spring Boot\"}";
    }
    @GetMapping("/speakers")
    @ResponseBody
    public List<Speaker> getSpeakers(){
        return speakerService.findAll();
    }

}
