package Part9;
class Vehicle{
    String name;
    public Vehicle(String name){
        this.name= name;
    }
}

class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }
}

class Motorcycle extends Vehicle{
    public Motorcycle(String name) {
        super(name);
    }
}
class Garage<T> extends Vehicle{
    public Garage(String name) {
        super(name);
    }
}

public class Task38 {
    public static void main(String[] args) {
        Car wolkswagen = new Car("Golf");
        Motorcycle honda = new Motorcycle("Honda cbr 600f2");
        Garage bmw= new Garage("BMW");
        Garage MB = new Garage("Mercedes");
        System.out.println(bmw.name);
        System.out.println(MB.name);
    }
}
