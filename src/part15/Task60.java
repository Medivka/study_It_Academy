package part15;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;

import java.text.SimpleDateFormat;

public class Task60
{
    public Task60()
    {

        ExecutorService executor;
        executor = Executors.newFixedThreadPool(3);


        List<Future<String>>  futures;

        futures = new ArrayList<Future<String>>();


        Callable<String> callable = new CallableClass();

        for (int i = 0; i < 3; i++){
            Future<String> future;
            future = executor.submit(callable);
            futures.add(future);
        }
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat(" HH:mm:ss  ");
        for (Future<String> future : futures){
            try {

                String text = " Hello World" + sdf.format(new Date())
                        + future.get() ;
                FileWriter fileWriter;
                fileWriter=new FileWriter("part15\\Task60.txt",true);
                fileWriter.write(text + "\n");
                fileWriter.close();

                System.out.println(text);
            } catch (InterruptedException | ExecutionException | IOException e) {}
        }

        executor.shutdown();
    }

    class CallableClass implements Callable<String>
    {
        @Override
        public String call() throws Exception {
            Thread.sleep(100);
            return Thread.currentThread().getName();
        }
    }
       public static void main(String args[]) {
        for (int i=0;i<10;i++)
        {
        new Task60();
       }
    }
}