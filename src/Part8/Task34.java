package Part8;


class Director implements ITask34 {
}

class Prorab extends Director {
}

class Working extends Prorab {
}

public class Task34 {
    public static void main(String[] args) {
        Director IvanNIkolaevich = new Director();
        IvanNIkolaevich.Zarplata(23, 232, 2323);
        Prorab Ivanich = new Prorab();
        Ivanich.Zarplata(30, 4000);
        Working Pashka = new Working();
        Pashka.Zarplata(45);
    }
}
