package part12;

public class Person {
    String name;
    String surname;
    Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + name +
                " " + surname +
                " age= " + age +
                '.';
    }
}
