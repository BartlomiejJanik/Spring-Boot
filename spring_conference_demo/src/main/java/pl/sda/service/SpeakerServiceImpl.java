package pl.sda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pl.sda.SpeakerProcessor;
import pl.sda.model.Speaker;
import pl.sda.repository.SpeakerRepostiory;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepostiory speakerRepository;
    private SpeakerProcessor speakerProcessor;

    public SpeakerServiceImpl() {
    }

//    public SpeakerServiceImpl(SpeakerRepostiory speakerRepository) {
//        System.out.println("Constructor injection");
//        this.speakerRepository = speakerRepository;
//    }

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakerList = speakerRepository.findAll();
        Speaker speaker = speakerRepository.findAll().get(0);
        speakerProcessor.setSpeaker(speaker);
        speakerProcessor.modify();
        speakerList.add(0,speaker);
        return speakerList;
    }

    @Autowired
    public void setSpeakerProcessor(SpeakerProcessor speakerProcessor) {
        this.speakerProcessor = speakerProcessor;
    }

    @Autowired
    public void setSpeakerRepository(SpeakerRepostiory speakerRepository) {
        System.out.println("Set injection");
        this.speakerRepository = speakerRepository;
    }
}
