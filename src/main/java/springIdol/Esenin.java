package springIdol;

/**
 * Created by Marhuz on 11.01.2018.
 */
public class Esenin implements Poem {
    static String[] LINES = {
            "Еду. Тихо. Слышны звоны",
            "Под копытом на снегу.",
            "Словно серые вороны",
            "Раскричались на лугу."};

    public void recite() {
        for (int i = 0 ; i < LINES.length; i++){
            System.out.println(LINES[i]);
        }
    }
}
