package part19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


class Radio{
      void radioON(){
        System.out.println("Radio on AIR");
    }
    void radioOFF(){
        System.out.println("Radio is OFF");
    }
}

public class Task71 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Radio radio=new Radio();
        Class mradio=Radio.class;
        Method method =mradio.getDeclaredMethod("radioON",null);
        method.invoke(radio,null);
    }
}
