package pl.sda.repository;

import pl.sda.model.Speaker;

import java.util.List;

public interface SpeakerRepositoryImpl {
    List<Speaker> findAll();
}
