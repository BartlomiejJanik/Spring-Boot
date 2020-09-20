package pl.sda.conferenceDemo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "speaker")
@Data
public class Speaker {

    @Id
    @GeneratedValue
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
