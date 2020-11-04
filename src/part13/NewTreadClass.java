package part13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class NewTreadClass implements Runnable, Itask52 {
    @Override
    public void run() {
        Thread thread = new Thread();
        thread.start();
        System.out.println(thread.getName() + "  :" + MaxElement((ArrayList) CreateCollection(10)));
    }

    @Override
    public List CreateCollection(Integer QuantityNumbers) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < QuantityNumbers; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        return arrayList;
    }


    @Override
    public Integer MaxElement(ArrayList list) {
        int max;
        max = (int) Collections.max(list);
        return max;

    }

    @Override
    public Integer MiddleArithmetick(ArrayList list) {
        return null;
    }
    @Override
    public void CreateNewFIle(String Package, String NameFile) {

    }


}
