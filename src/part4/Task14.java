package part4;

public class Task14 {
    public static void main(String[] args) {

        long i = 7893823445L;
        long summa = 0L;
        do {
            summa = summa + (i % 10);
            i /= 10;
        }
        while (i != 0);

        System.out.println(summa);
    }
}

