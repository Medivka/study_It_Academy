package part17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Task64 {
    public static void main(String[] args) {
         int mounth=9;
        LocalDate today = LocalDate.now();
        LocalDate end =LocalDate.of(today.getYear(),mounth+1,1);
        today=LocalDate.of(today.getYear(), mounth,1);
        for(; today.isBefore(end);){
            System.out.println(today.format(DateTimeFormatter.ofPattern("d::MMM:uuuu")));
            today=today.plusDays(1);
        }

//        int k = 2;
//        int year = 2021;
//
//        if (k < 0 && k > 13) {
//            System.out.println("Error");
//        }
//
//        if (k == 2) {
//
//            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
//                for (int i = 1; i < 30; i++) {
//                    System.out.println(i + "." + k + "." + year);
//                }
//            } else
//                for (int i = 1; i < 29; i++) {
//                    System.out.println(i + "." + k + "." + year);
//                }
//
//        }
//        if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12) {
//            for (int i = 1; i < 32; i++) {
//                System.out.println(i + "." + k + "." + year);
//            }
//        }
//        if (k == 4 || k == 6 || k == 9 || k == 11) {
//            for (int i = 1; i < 31; i++) {
//                System.out.println(i + "." + k + "." + year);
//            }
//        }
    }
}
