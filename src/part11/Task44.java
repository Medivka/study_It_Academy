package part11;
class Person{
    Integer age;
       public void setAge(Integer age) throws AgeException {
        if(age>100){
            throw new AgeException("Age is not correct < 100");
        }
        this.age = age;
    }

};
class Age{
    public void getAge(Integer age){
        Person person=new Person();
        try{
        person.setAge(age);
        }catch (AgeException e){
            System.err.println(e.getMessage());;
        }}
}

public class Task44 {
    public static void main(String[] args) {
        Age Mike=new Age();
        Mike.getAge(102);
    }
}
