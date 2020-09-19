package pl.sda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;
import pl.sda.repository.SpeakerRepostiory;
import pl.sda.service.SpeakerService;
import pl.sda.service.SpeakerServiceImpl;

@Configuration
@ComponentScan({"pl.sda"})
public class AppConfig {

    @Bean
    public SpeakerProcessor getSpeakerProcessor(){
        return new SpeakerProcessor();
    }

//    @Bean(name = "speakerService")
//    @Scope(value = "prototype")
//    public SpeakerService getSpeakerService(){
//        return new SpeakerServiceImpl();
//    }
//
//    @Bean(name="speakerRepository")
//    @Scope(value = "singleton")
//    public SpeakerRepostiory getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }

}
