package part18;

import java.time.LocalTime;

class SingletonTime{

private static SingletonTime singletonTime;
private static LocalTime localTime=LocalTime.now();
private SingletonTime(){


    System.out.println(localTime);
};
public static SingletonTime getSingletonTime(){
    if(singletonTime==null){
        singletonTime=new SingletonTime();
    }
    return singletonTime;
}

}
public class Task67 {
    public static void main(String[] args) {

        SingletonTime.getSingletonTime();
    }
}
