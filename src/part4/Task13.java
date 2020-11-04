package part4;

public class Task13 {
    public static void main(String[] args) {
        double proizvedenie = 1;
        int i = 0;
        do {
            i++;
            proizvedenie = proizvedenie * i;
        }
        while (i <= 24);
        {
            System.out.println("Произведение чисел от 1 до 25 равно :" + proizvedenie);

        }


    }
}
