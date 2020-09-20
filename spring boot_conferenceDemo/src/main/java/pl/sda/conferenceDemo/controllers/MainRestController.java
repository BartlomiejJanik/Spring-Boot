package pl.sda.conferenceDemo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.conferenceDemo.models.Speaker;
import pl.sda.conferenceDemo.services.SpeakerService;

import java.util.List;

@RestController
@RequestMapping("/rest")
@AllArgsConstructor
public class MainRestController {

    @Autowired
    private SpeakerService speakerService;

    @GetMapping("")
    public String getMessage() {
        return "{message:\"Hello Spring Boot\"}";
    }

    @GetMapping("/speakers")
    @ResponseBody
    public List<Speaker> getSpeakers() {
        return speakerService.findAll();
    }

    @PostMapping("/saveSpeakers")
    @ResponseBody
    public List<Speaker> saveSpeakers(@RequestBody List<Speaker> speakerList) {
        return speakerService.saveAll(speakerList);
    }

    @PostMapping("/saveSpeaker")
    @ResponseBody
    public Speaker saveSpeaker(@RequestBody Speaker speaker) {
        return speakerService.save(speaker);
    }

    @GetMapping("/getSpeaker/{speakerId}")
    @ResponseBody
    public Speaker getSpeakerById(@PathVariable(value = "speakerId") long userId) {
        System.out.println("SPEAKER ID: " + userId);
        return null;
    }

}
