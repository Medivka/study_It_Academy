package part4;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("The factorial of 0 is : 1");
        int factorial = 9;
        long summa = 1L;
        int i = 0;
        while (i <= factorial) {
            i++;
            summa = summa * i;
            System.out.println("The factorial of  " + i + " is : " + summa);
        }

    }
}
