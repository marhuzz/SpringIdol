package springIdol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Marhuz on 11.01.2018.
 */
public class Instrumentalist implements  Performer {

    private String song;
    private Instrument instrument;

    public void perform() throws PerformException {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public String screamSong(){
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument){
        this.instrument = instrument;
    }
}
