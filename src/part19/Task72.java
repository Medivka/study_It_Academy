package part19;

import java.lang.annotation.*;
import java.lang.reflect.Method;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface AcademyInfo {
   public int year();


}
class Academy{
    @AcademyInfo(year = 2020)
    public void haveAnnotation() {
        System.out.println("Annotation is create");

    }
    public void dontHaveAnnotation(){
        System.out.println("No Annotation");
    }
};
public class Task72 {
    public static void main(String[] args) throws NoSuchMethodException {

      Academy academy=new Academy();
      academy.haveAnnotation();


    }
}
