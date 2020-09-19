package pl.sda.service;

import pl.sda.model.Speaker;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;
import pl.sda.repository.SpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepositoryImpl speakerRepository ;

    public SpeakerServiceImpl() {
    }

    public SpeakerServiceImpl(SpeakerRepositoryImpl speakerRepository) {
        System.out.println("Constructor injection");
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();

    }
    public void setSpeakerRepository(HibernateSpeakerRepositoryImpl speakerRepository) {
        System.out.println("Set injection");
        this.speakerRepository = speakerRepository;
    }
}
