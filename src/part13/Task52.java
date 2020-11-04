package part13;

import part1.Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task52 extends Thread implements Itask52 {
    @Override
    public List CreateCollection(Integer QuantityNumbers) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < QuantityNumbers; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        return arrayList;
    }


    @Override
    public Integer MiddleArithmetick(ArrayList list) {
        int Middle;
        int k ;
        int summaall = 0;

        for (int i=0;i< list.size();i++){
            k= (int) list.get(i);
            summaall+=k;
        }
        Middle=summaall/list.size();
        return Middle;

    }

    @Override
    public Integer MaxElement(ArrayList list) {
        return null;
    }

    @Override
    public void CreateNewFIle(String Package, String NameFile) {

    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Task52 task52 = new Task52();
            Thread t1 = new Thread();
            t1.start();
            System.out.println(task52.MiddleArithmetick((ArrayList) task52.CreateCollection(10)));

        }

    }
}
