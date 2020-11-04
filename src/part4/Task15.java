package part4;

public class Task15 {
    public static void main(String[] args) {

        Integer n = 0;
        for (Integer i = 50; i <= 70; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                n++;

            }
            if (n == 2) {
                System.out.print(i + " ");
                break;
            }

        }


    }
}
