package sortirovkamassiva;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        int [] x = {2, 1, -4, 56, 6, 3, 4, 9, 7, 8, 5, 40};
   //     int[] x = new int[10];
   //     for (int i =0; i< x.length; i++){
   //         x[i]= (int)(Math.random()*10);
   //     }
        System.out.println(Arrays.toString(x));
        int low = 0;
        int high = x.length - 1;
        quickSort(x, low, high);
        System.out.println(Arrays.toString(x));
    }
}



