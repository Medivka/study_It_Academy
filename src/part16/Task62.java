package part16;


import java.util.*;
import java.util.stream.Collectors;


class Person {
    private String name;
    private String surname;
    private Integer age;
     public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
     public Integer getAge() {
        return age;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person "+
                ": " + name +
                " " + surname +
                " " + age;
    }
}

public class Task62 {
    public static void main(String[] args) {

        String[] Name = {"Anna", "Boris", "Patrick", "Victor", "Elena", "Tom", "Maria", "Vera", "Katerina", "Rita"};
        String[] Surname = {"Reshetko", "Miloko", "Grunlo", "Hylo", "Lipotado", "Tinkoff", "Rukashenko", "Timoshenko", "Ovechkinof", "Klimovec"};
       ArrayList<Person> people = new ArrayList();
        for (int i = 1; i < 101; i++) {
            String surname = Surname[(int) (Math.random() * 10)];
            String name = Name[(int) (Math.random() * 10)];
            Integer age = (int) (15 + Math.random() * 15);
            people.add( new Person(surname, name, age));
        }


List<Person> sorted =people.stream()
        .sorted((o1, o2) -> o1.getAge()- o2.getAge())
        .takeWhile(person -> person.getAge()<21)
        .collect(Collectors.toList());
   //     sorted.forEach(person -> System.out.println(person));
        List<Person> sortedtwo;
        sortedtwo = sorted.stream()
              .sorted(Comparator.comparing(Person::getName))
                .sorted(Comparator.comparing(Person::getSurname))
                .collect(Collectors.toList());
    //    sortedtwo.forEach(person -> System.out.println(person));
        List<Person> sortedthree;
      sortedthree=sortedtwo.stream()
      .limit(4)
      .collect(Collectors.toList());
     sortedthree.forEach(person -> System.out.println(person));
      


    }
}
