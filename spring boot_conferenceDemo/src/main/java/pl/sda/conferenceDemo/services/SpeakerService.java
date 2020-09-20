package pl.sda.conferenceDemo.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.conferenceDemo.models.Speaker;
import pl.sda.conferenceDemo.repositorys.SpeakerRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SpeakerService {

    private SpeakerRepository speakerRepository;

    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }

    public List<Speaker> saveAll(List<Speaker> speakerList){
        return (List<Speaker>) speakerRepository.saveAll(speakerList);
    }

    public Speaker save(Speaker speaker){
        return speakerRepository.save(speaker);
    }

    public Speaker findById(long id){
        Optional<Speaker> speaker = speakerRepository.findById(id);
        return speaker.orElseGet(Speaker::new);
    }

}
