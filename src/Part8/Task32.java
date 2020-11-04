package Part8;


class Appliances implements ITask32 {

    @Override
    public void on() {
        System.out.println("ON");
    }

    @Override
    public void off() {
        System.out.println("OFF");

    }
}

class KitchenAppliances extends Appliances {
}

class Teapot extends KitchenAppliances {
}
public class Task32 {
    public static void main(String[] args) {
        Teapot teapot = new Teapot();
        teapot.on();
        KitchenAppliances mixer = new KitchenAppliances();
        mixer.off();
        KitchenAppliances refrigerator = new KitchenAppliances();
        refrigerator.on();
    }
}
