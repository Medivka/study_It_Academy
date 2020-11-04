package part3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter day month year");
        Integer day = str.nextInt();
        Integer month = str.nextInt();
        Integer year = str.nextInt();

        if ((day < 0) || (day > 31) || (month < 0) || (month > 12)) {
            System.out.println("Enter correct date");
        } else if ((day > 29) && (month == 2)) {
            System.out.println("Enter correct date");
        } else if (day == 29 && month == 2 &&  !(year % 4 == 0) && !(year%400==0) && !(year%100==0)){
            System.out.println("Enter correct date");}
        else
        if ((day == 28) && month == 2 && year % 4 == 0 && year % 400 == 0 && year % 100 != 0) {
            day = 1;
            month++;
            System.out.println(day + " " + month + " " + year);
        } else if (day == 29 && month == 2 && !(year % 4 == 0 && year % 400 == 0 && year % 100 != 0)) {
            day = 1;
            month++;
            System.out.println(day + " " + month + " " + year);
        } else if ((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month++;
            System.out.println(day + " " + month + " " + year);
        } else if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month++;
            System.out.println(day + " " + month + " " + year);
        } else if ((day == 31) && month == 12) {
            day = 1;
            month = 1;
            year++;
            System.out.println(day + " " + month + " " + year);
        } else {
            day++;
            System.out.println(day + " " + month + " " + year);
        }
    }
}

