package pl.sda;

import pl.sda.model.Speaker;

public class SpeakerProcessor {
    private Speaker speaker;

    public SpeakerProcessor(Speaker speaker) {
        this.speaker = speaker;
    }

    public SpeakerProcessor() {
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
    public Speaker modify(){
        speaker.setLastName("Silly");
        return speaker;
    }
}
