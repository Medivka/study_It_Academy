package part3;

import java.util.Scanner;


public class Task11 {
    public static void main(String[] args) {
        System.out.println("Diary welcomes you \n Enter the day of the week: ");
        Scanner str = new Scanner(System.in);
        Integer day = str.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday" );
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");

        }
    }
}
