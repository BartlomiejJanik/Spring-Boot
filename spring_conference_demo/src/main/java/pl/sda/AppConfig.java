package pl.sda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;
import pl.sda.repository.SpeakerRepostiory;
import pl.sda.service.SpeakerService;
import pl.sda.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(value = "prototype")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setSpeakerRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name="speakerRepository")
    @Scope(value = "singleton")
    public SpeakerRepostiory getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

}
