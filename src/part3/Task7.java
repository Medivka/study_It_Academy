package part3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter width and height rectangle : ");
        Scanner str = new Scanner(System.in);
        Integer a = str.nextInt();
        Integer b = str.nextInt();
        System.out.println("enter the diameter of the circle: ");
        Integer d = str.nextInt();
        if (Math.sqrt(a*a + b*b) <= d)
            System.out.println("the circle will close the hole");
        else
            System.out.println("the circle won't close the hole");

    }
}
