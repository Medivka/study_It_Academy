package part3;


import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("enter the amount: ");
        Scanner str = new Scanner(System.in);
        Integer summa = str.nextInt();

        switch (summa % 10) {
            case (1):
                if (summa == 111) {
                    System.out.println(summa + " ryblei");
                    break;
                }
                System.out.println(summa + " rybl'");
                break;
            case (2):
            case (3):
            case (4):
                System.out.println(summa + " ryblia");
                break;
            default:
                System.out.println(summa + " ryblei");

        }
    }
}
