package pl.sda.repository;

import org.springframework.stereotype.Repository;
import pl.sda.model.Speaker;

import java.util.ArrayList;
import java.util.List;
@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepostiory {

    @Override
    public List<Speaker> findAll(){

        List<Speaker> list = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Adam");
        speaker.setLastName("Szczęsny");

        list.add(speaker);

        return list;
    }

}
