package part3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("First house: \n width=");
        Integer a = str.nextInt();
        System.out.print("length=");
        Integer b = str.nextInt();
        System.out.print("Second house: \n width=");
        Integer c = str.nextInt();
        System.out.print("length=");
        Integer d = str.nextInt();
        System.out.print("Size field: \n width=");
        Integer e = str.nextInt();
        System.out.print("length=");
        Integer f = str.nextInt();
        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println(" House's is building");
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println("House's is building");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println(" House's is building");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println(" House's is building");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println(" House's is building");
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println("House's is building");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println(" House's is building");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println(" House's is building");
        }
        else
            System.out.println("House's is not building");
    }
}


