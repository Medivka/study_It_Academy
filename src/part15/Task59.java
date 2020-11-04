package part15;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task59 {


   static class MyCollable implements Callable<Void> {
        List createCollection(){
            ArrayList arrayList=new ArrayList(10);
            for(int i=0;i<arrayList.size();i++){
                arrayList.add(Math.random()*10);

            } return arrayList;}

Integer SummaAllElement(ArrayList list){
                int summa=0;
                int k = 0;
                for (int i=0;i< list.size();i++){
                    k= (int) list.get(i);
                    summa+=k;

                    System.out.println(summa);

            }return k;
        }
        @Override
        public Void call() throws Exception {
            ArrayList arrayList= (ArrayList) createCollection();
            int k=SummaAllElement(arrayList);

            return null;
        }


    }
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        executorService.submit(new MyCollable());
        executorService.shutdown();

    }}
