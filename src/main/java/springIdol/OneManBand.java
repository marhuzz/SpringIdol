package springIdol;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Marhuz on 11.01.2018.
 */
public class OneManBand implements Performer {

    private Map<String,Instrument> map;

    public void perform() throws PerformException {
        for (String key : map.keySet()){
            System.out.println(key + " : ");
            Instrument instrument = map.get(key);
            instrument.play();
        }
    }

    public void setMap(Map<String, Instrument> map) {
        this.map = map;
    }
}
