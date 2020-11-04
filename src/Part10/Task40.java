package Part10;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task40 extends Apprentice {
    public static void main(String[] args) {
        Apprentice Nikolaev = new Apprentice();
        ArrayList nikolaev= Nikolaev.ListOcenok(23);
        System.out.println(nikolaev);
        System.out.println(Nikolaev.Bezpovtorov(nikolaev));
    }
}
