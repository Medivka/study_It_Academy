package part16;

import java.util.Arrays;


public class Task61 {
    public static void main(String[] args) {
        Integer[] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        Arrays.stream(array)
                .filter( n -> (n % 2 == 0) )
                .forEach(System.out::println);
        Arrays.stream(array).filter(n->(n%2==0))
                .mapToDouble(n->(n*2.54))
                .forEach(System.out::println);


    }
}
