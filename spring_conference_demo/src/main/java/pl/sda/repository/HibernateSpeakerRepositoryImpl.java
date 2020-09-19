package pl.sda.repository;

import pl.sda.model.Speaker;

import java.util.ArrayList;
import java.util.List;

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
