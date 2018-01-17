package springIdol;

/**
 * Created by Marhuz on 10.01.2018.
 */
public class Juggler implements Performer {
    private int beansBags = 3;

    public Juggler(int beansBags) {
        this.beansBags = beansBags;
    }

    public void perform() throws PerformException {
        System.out.println("JUGGLING " + beansBags + " Juggling" );
    }
}
