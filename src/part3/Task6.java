package part3;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Vvedite celoe chislo: ");
        Integer x = str.nextInt();
        Boolean b;

        if (x%10==7)
            b = true;
        else
            b = false;
            System.out.println(b);
    }
}
