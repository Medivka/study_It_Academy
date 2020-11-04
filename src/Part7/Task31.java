package Part7;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Task31 {
    private static void stroka() {
        String str = "aaabbbccc";
        for(int i =0; i<1000000;i++)
            str += "aaabbbccc" ;


    }
    private static void Bulder() {
        int i = 0;
        StringBuffer strBuffer = new StringBuffer("aaabbbccc");
        while (i < 1000000) {
            i++;
            strBuffer.append("aaabbbccc");

        }
    }
    public static void main(String[] args) {
        long FirstStartTime = System.nanoTime();
        stroka();
        long FirstEndTime = System.nanoTime();
        long FirstAllTime= FirstEndTime-FirstStartTime;
        System.out.println(FirstAllTime);
        long SecondStartTime = System.nanoTime();
        Bulder();
        long SecondEndTime=System.nanoTime();
        long SecondAllTime=SecondEndTime-SecondStartTime;
        System.out.println(SecondAllTime);
        if (FirstAllTime < SecondAllTime) {
            System.out.println("First fast");
        } else
            System.out.println("Second fast");
    }
}
