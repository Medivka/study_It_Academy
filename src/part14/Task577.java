package part14;


import java.util.ArrayList;
import java.util.List;


class o4ered {
    static List list = new ArrayList();
    static Integer s4et4ik = 0;
}
class Proizvoditel extends Thread {
    List add(List list) {
        o4ered.list = list;
        o4ered.list.add((int) (Math.random() * 100));
        System.out.println("add");
        return list;
    }
    @Override
    public void run() {
     add(o4ered.list);
    }
}
class Potrebitel extends Thread {

    List delete(List list) {
        o4ered.list = list;
        o4ered.list.remove(o4ered.list.size() - 1);
        System.out.println("delete");
        return o4ered.list;
    }
    @Override
    public void run() {
        delete(o4ered.list);
    }
}
public class Task577 {
    public static void main(String[] args) throws InterruptedException {
        Integer cicle = 10000;
        for (int i = 0; i < 200; i++) {
            o4ered.list.add((int) (Math.random() * 100));
            System.out.println(o4ered.list.get(i));
        }
        Potrebitel potrebitelFirst = new Potrebitel();
        Potrebitel potrebitelSecond = new Potrebitel();
        Proizvoditel proizvoditelFirst = new Proizvoditel();
        Proizvoditel proizvoditelSecond = new Proizvoditel();
        Proizvoditel proizvoditelFree = new Proizvoditel();


        while (o4ered.s4et4ik < cicle) {
            while (o4ered.list.size() > 80 && o4ered.s4et4ik < cicle) {
                potrebitelFirst.run();
                potrebitelSecond.run();
                o4ered.s4et4ik = o4ered.s4et4ik + 2;
                if (o4ered.list.size() < 80) {
                    potrebitelFirst.wait();
                    potrebitelSecond.wait();
                }
            }
            while (o4ered.list.size() < 100 && o4ered.s4et4ik < cicle) {
                proizvoditelFirst.run();
                proizvoditelSecond.run();

                o4ered.s4et4ik = o4ered.s4et4ik + 2;
                if (o4ered.list.size() > 100) {
                    proizvoditelFirst.wait();
                    proizvoditelSecond.wait();


                }
            }
            System.out.println(" s4et4ik : " + o4ered.s4et4ik);

        }
        System.out.println(o4ered.list.size());
    }
}


