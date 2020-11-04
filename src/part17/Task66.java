package part17;

import java.time.LocalDate;

public class Task66 {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        System.out.println(today.minusDays(60));
    }
}
