package part18;



    class Person {
        private String surname;
        private String name;
        private int age;


        Person(String name, int age, String surname) {
            this.name = name;
            this.age = age;
            this.surname=surname;

        }

        public Person(String surname, String name, int age) {
        }

        public static Personbuilder builder() {
            return new Personbuilder();
        }

        public static class Personbuilder {
            private String surname;
            private String name;
            private int age;


            Personbuilder() {
            }
            public Personbuilder surname(String surname) {
                this.surname = surname;
                return this;
            }

            public Personbuilder name(String name) {
                this.name = name;
                return this;
            }

            public Personbuilder age(int age) {
                this.age = age;
                return this;
            }

            public Person build() {

                return new Person(surname, name, age);
            }


        }
    }
public class Task68 {
    public static void main(String[] args) {
        System.out.println(Person.builder().age(23).name("asdasda").surname("sdasd").build().toString());

    }
}
//class Person{
//    String name;
//    String Surname;
//    Integer age;
//    public void info(){
//        System.out.println(name+ " " + Surname+ " "+ age);
//    }
//
//
//}
//interface  PersonBuilder{
//    PersonBuilder setName(String name);
//    PersonBuilder setSurname(String surname);
//    PersonBuilder setage(Integer age);
//    Person Builder();
//
//}
//class PersonBuilderimpl  implements PersonBuilder{
//    Person person =new Person();
//    @Override
//    public PersonBuilder setName(String name) {
//        person.name=name;
//        return this;
//    }
//
//    @Override
//    public PersonBuilder setSurname(String surname) {
//        person.Surname=surname;
//        return this;
//    }
//
//    @Override
//    public PersonBuilder setage(Integer age) {
//        person.age=age;
//        return this;
//    }
//
//    @Override
//    public Person Builder() {
//        return person;
//    }
//}
//
//
//public class Task68 {
//    public static void main(String[] args) {
//       Person person=new PersonBuilderimpl().setName("weqwe").setSurname("sdasda").setage(23).Builder();
//        person.info();
//
//    }
//}
