package Part10;

import java.util.*;

class Apprentice {

    List List;
    List arraylist;

    public ArrayList ListOcenok(int Koli4estvoOcenok) {
        this.arraylist = List;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <Koli4estvoOcenok; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        return arrayList;
    }

    public ArrayList ClearList(ArrayList list) {
        this.arraylist = list;
        for (Iterator<Integer> it = list.iterator(); it.hasNext(); )
            if (it.next() < 5)
                it.remove();
        return list;
    }

    public Integer MaxMark(ArrayList list) {
        int max;
        max= (int) Collections.max(list);
        return max;

    }

    public LinkedHashSet Bezpovtorov(ArrayList list) {
        this.arraylist = list;
        Set<Integer> set = new LinkedHashSet<>(list);
        return (LinkedHashSet) set;
    }
}

public class Task39 {
    public static void main(String[] args) {
        Apprentice Ivanov = new Apprentice();
        ArrayList ivanov = Ivanov.ListOcenok(20);
        System.out.println(ivanov);
        System.out.println(Ivanov.ClearList(ivanov));

        Apprentice Seleznev = new Apprentice();
        ArrayList seleznev = Seleznev.ListOcenok(21);
        System.out.println(seleznev);
        System.out.println(Seleznev.ClearList(seleznev));
        Apprentice Sobolev = new Apprentice();
        ArrayList sobolev = Sobolev.ListOcenok(21);
        System.out.println(sobolev);
        System.out.println(Sobolev.ClearList(sobolev));
    }
}