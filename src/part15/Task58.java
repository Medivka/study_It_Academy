package part15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task58 {
     class MyCallable{
        Callable task=()->{
            return "hello world";
        };
    }
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

    }

}
