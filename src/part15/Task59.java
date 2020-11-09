package part15;



import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;


public class Task59 {
    public Task59() throws  ExecutionException, InterruptedException {
        ExecutorService executor;
        executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures;
        futures = new ArrayList<Future<String>>();
        Callable<String> callable = new CallableClass();
        for (int i = 0; i < 3; i++) {
            Future<String> future;
            future = executor.submit(callable);
            futures.add(future);
        }
        for (Future<String> future : futures) {
            int summa = 0;
            List list = new ArrayList();
            for (int i = 0; i < 10; i++) {
                int k=(int) (Math.random()*10);
                list.add(k);
                summa = summa+k;
            }
            System.out.println(summa+" "+ future.get());
        }
        executor.shutdown();
    }
    class CallableClass implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep((int)( Math.random() * 10000));
            return Thread.currentThread().getName();
        }
    }
    public static void main(String args[]) throws  ExecutionException, InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Task59();
        }
    }
}
