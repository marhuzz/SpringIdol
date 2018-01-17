package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Marhuz on 10.01.2018.
 */
public class Main {
    public static void main (String args[]) throws PerformException {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\springidol\\src\\main\\resources\\springIdol\\spring-idol");
        Performer performer = (Performer) ctx.getBean("duke");
        Performer performer1 = (Performer) ctx.getBean("karl");
        Performer performer2 = (Performer) ctx.getBean("kenny");
        Performer performer3 = (Performer) ctx.getBean("kennyG");
        Performer performer4 = (Performer) ctx.getBean("hank");
        performer.perform();
        performer1.perform();
        performer2.perform();
        performer3.perform();
        performer4.perform();
    }
}
