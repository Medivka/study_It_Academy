package part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task21 {
    public static void main(String[] args) {

        Integer sum = 0;
        Integer[] massiv = new Integer[]{1, 2, 3, 9, 4, 7, 3, 6, 0, 0, 1,0};
        ArrayList<Integer> mas = new ArrayList(Arrays.asList(massiv));
        int MinLastIndex = mas.lastIndexOf(Collections.min(mas));
        int MinFirstIndex = mas.indexOf(Collections.min(mas));
        int MaxLastIndex = mas.lastIndexOf(Collections.max((mas)));
        int MaxFirstIndex = mas.indexOf(Collections.max(mas));

       // System.out.println(MinLastIndex);//9
      //  System.out.println(MinFirstIndex);//3
      //  System.out.println(MaxLastIndex);//11
       // System.out.println(MaxFirstIndex);//11
        if (MinFirstIndex < MaxLastIndex) {
            for (int i = MinFirstIndex + 1; i < MaxLastIndex; i++) {
                sum += mas.get(i);
            }
        }
        if (MaxFirstIndex < MinLastIndex) {
            for (int i = MaxFirstIndex + 1; i < MinLastIndex; i++) {
                sum += mas.get(i);
            }

        }
        System.out.println("summa = :"+sum);
    }

}



