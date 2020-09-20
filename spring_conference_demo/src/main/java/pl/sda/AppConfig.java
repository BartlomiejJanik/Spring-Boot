package pl.sda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.sda.processor.SpeakerProcessor;

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
