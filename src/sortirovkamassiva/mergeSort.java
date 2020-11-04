package sortirovkamassiva;

import java.util.*;
import java.lang.*;

class mergeSort {

    public static Integer[] array = {2, 1, -4, 56, 6, 3, 4, 9, 7, 8, 5, 40};
    public static void merge(int begin, int end) {
        int mid = (begin + end) / 2;
        int[] t = new int[end - begin + 1];
        int index1 = begin;
        int index2 = mid + 1;
        int indexT = 0;
        while ((index1 <= mid) || (index2 <= end)) {
            if (index1 > mid) {
                t[indexT++] = array[index2++];
                continue;
            }
            if (index2 > end) {
                t[indexT++] = array[index1++];
                continue;
            }
            if (array[index2] > array[index1]) {
                t[indexT++] = array[index1++];
                continue;
            } else {
                t[indexT++] = array[index2++];
                continue;
            }
        }
        for (int i = 0; i < end - begin + 1; i++) {
           array[i + begin] = t[i];
        }
    }
    public static void sort(int start, int finish) {
        if (start == finish)
            return;
        int mid = (start + finish) / 2;
        sort(start, mid);
        sort(mid + 1, finish);
        merge(start, finish);
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(array));
        sort(0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}