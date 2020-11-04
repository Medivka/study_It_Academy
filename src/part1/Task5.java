package part1;

import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Введите промежуток в секундах: ");
        long s = str.nextLong();
        //long mounth, week;
        long  w, day, d, m, min, hour, h, sec;
        sec = s % 60;          ///second
        m = (s - sec) / 60;
        min = m % 60;          //// min
        h = (m - min) / 60;
        hour = h % 24;         /// hour
        d = (h - hour) / 24;
        day = d % 7;           /// day
        w = (d - day) / 7;     // week
        //week = w % 4;
        //mounth = (w - week) / 4;/// mounth


        System.out.println( w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");


    }
}
