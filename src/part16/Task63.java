package part16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task63 {
    public static void main(String[] args) {
        Integer n=100;
        List <Integer> list=new ArrayList<>(n);
        Integer minValue=0;
        Integer maxValue=60;
        for (int i=1;i<n;i++){
        list.add((int) (minValue+Math.random()*maxValue));}
        System.out.println(list.toString());
        list.stream()
                .filter(i -> ((i % 3 == 0)&&(i%5==0)))
                .forEach(System.out::print);

    }
}
