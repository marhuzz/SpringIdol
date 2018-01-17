package springIdol;

/**
 * Created by Marhuz on 11.01.2018.
 */
public class Stage {
    private Stage(){}

    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
}
