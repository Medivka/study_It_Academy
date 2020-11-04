package part19;

import part1.Task5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
    public String name;
    public String surname;
    public Integer age;
    public void Ooooops(){
        System.out.println("Ooooops");
    }

    public void    Wooooof(){
        System.out.println("Wooooof");
    }
    public void Pimpom(){
        System.out.println("Pimpom");
    }
    }

public class Task70 {
    public static void main(String[] args) {
     Person person=new Person();
        Class mPerson=Person.class;
        Field[] fields =mPerson.getFields();

        for (Field i: fields
             ) {
            System.out.println(i);
        }
        Method[] methods= mPerson.getMethods();
        for (Method m: methods
             ) {
            System.out.println(m);

        }
        Method method = null;
        try {
            method = mPerson.getDeclaredMethod("Pimpom",null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            method.invoke(person,null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
