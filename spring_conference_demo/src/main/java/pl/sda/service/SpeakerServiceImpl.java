package pl.sda.service;

import pl.sda.model.Speaker;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;
import pl.sda.repository.SpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepositoryImpl speakerRepository ;


    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();

    }
    public void setSpeakerRepository(HibernateSpeakerRepositoryImpl speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
