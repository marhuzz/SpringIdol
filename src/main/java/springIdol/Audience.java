package springIdol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut("execution(* springIdol.Performer.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void takeSeats(){
        System.out.println("The audience is taking their seats.");
    }//перед выступлением

    @Before("performance()")
    public void turnOffCellPhones(){
        System.out.println("turning off cellphones");
    }//перед выступлением

    @AfterReturning("performance()")
    public void applaud(){
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }//после выступления

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("BOOOO! WE WANT OUR MONEY BACK!!!");
    }//после неудачного выступления

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("The audience is taking hteir seats.");
            System.out.println("The audience is turning off their phones.");
            long start = System.currentTimeMillis();//Перед выступлением

            joinPoint.proceed();

            long end = System.currentTimeMillis();//После выступления
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The performance took " + (end-start) + " milliseconds.");
        }catch (Throwable throwable){
            System.out.println("Boooooo! we want our money back.");
        }
    }
}
