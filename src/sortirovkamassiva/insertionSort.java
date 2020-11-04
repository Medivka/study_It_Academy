package sortirovkamassiva;

import java.util.Arrays;

public class insertionSort {
    public static Integer[] array = {2, 1, -4, 56, 6, 3, 4, 9, 7, 8, 5, 40};
    //  {
    //      array = new Integer[10];
    //      for (int i = 0; i < array.length; i++) {
    //          array[i] = (int) (Math.random() * 10);
    //      }
    //  }
    public static void insertionsort() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
        insertionsort();
        System.out.println(Arrays.toString(array));
    }
}
