package pl.sda.conferenceDemo.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.conferenceDemo.models.Speaker;
import pl.sda.conferenceDemo.repositorys.SpeakerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SpeakerService {

    private SpeakerRepository speakerRepository;

    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }

}
