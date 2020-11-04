package part1;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите 2 целых числа :");
        Integer x = str.nextInt();
        Integer y = str.nextInt();

        System.out.println((x+y)+ (x*y));
    }
}
