package pl.sda.service;

import pl.sda.model.Speaker;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;
import pl.sda.repository.SpeakerRepostiory;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepostiory speakerRepository ;

    public SpeakerServiceImpl() {
    }

    public SpeakerServiceImpl(SpeakerRepostiory speakerRepository) {
        System.out.println("Constructor injection");
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();

    }
    public void setSpeakerRepository(SpeakerRepostiory speakerRepository) {
        System.out.println("Set injection");
        this.speakerRepository = speakerRepository;
    }
}
