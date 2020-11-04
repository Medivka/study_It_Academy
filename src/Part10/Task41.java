package Part10;

import java.util.ArrayList;

public class Task41 extends Apprentice {
    public static void main(String[] args) {
        Apprentice Ivanov = new Apprentice();
        ArrayList ivanov = Ivanov.ListOcenok(21);
        System.out.println(ivanov);
        System.out.println(Ivanov.MaxMark(ivanov));
    }
}
