package part5;

public class Task22 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "  ");
        }
        System.out.println("\n" );
        for (int i = array.length - 1; i >= 0; i--)
        {
            System.out.print( array[i] + "  ");
        }
    }
}
