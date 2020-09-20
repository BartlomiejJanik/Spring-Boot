package pl.sda.conferenceDemo.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.conferenceDemo.models.Speaker;

import java.util.List;

@Repository
public interface SpeakerRepository  extends CrudRepository<Speaker,Long> {

    List<Speaker> findAll();

    List<Speaker> saveAll(List<Speaker> speakerList);

}
