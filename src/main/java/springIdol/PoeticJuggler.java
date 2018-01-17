package springIdol;

/**
 * Created by Marhuz on 11.01.2018.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(int beansBags,Poem poem) {
        super(beansBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformException {
        super.perform();
        System.out.println(" While reciting.... ");
        poem.recite();
    }
}
