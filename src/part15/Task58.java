package part15;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;


public class Task58 {
    public Task58() throws IOException, ExecutionException, InterruptedException {

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
            String text = new String();
            for (int k = 0; k < 10; k++) {
                for (int i = 0; i < 10; i++) {
                    text = text + " random text : " + i + " " + future.get() + "\n";
                }
                FileWriter fileWriter;
                fileWriter = new FileWriter("part15\\task58\\" + k + "    " + future.get() + ".txt");
                fileWriter.write(text + "\n");
                fileWriter.close();
            }
        }
        executor.shutdown();
    }
    class CallableClass implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep((int) Math.random() * 3000);
            return Thread.currentThread().getName();
        }
    }
    public static void main(String args[]) throws IOException, ExecutionException, InterruptedException {
        try {
            Files.createDirectories(Path.of("part15\\task58"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            new Task58();
        }
    }
}

