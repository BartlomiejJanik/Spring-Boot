package pl.sda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.processor.SpeakerProcessor;
import pl.sda.model.Speaker;
import pl.sda.repository.SpeakerRepostiory;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepostiory speakerRepository;
    private SpeakerProcessor speakerProcessor;

    @Autowired
    public SpeakerServiceImpl(SpeakerRepostiory speakerRepository, SpeakerProcessor speakerProcessor) {
        this.speakerRepository = speakerRepository;
        this.speakerProcessor = speakerProcessor;
        System.out.println("Constructor injection"+speakerRepository+ speakerProcessor);
    }

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


    public void setSpeakerProcessor(SpeakerProcessor speakerProcessor) {
        this.speakerProcessor = speakerProcessor;
    }


    public void setSpeakerRepository(SpeakerRepostiory speakerRepository) {
        System.out.println("Set injection");
        this.speakerRepository = speakerRepository;
    }
}
