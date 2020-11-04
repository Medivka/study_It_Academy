package part12;

public class Task48 implements Istr{
    public static void main(String[] args) {
        String url= "D:/HelloJava.txt.txt";
        Task48 task48=new Task48();
        String str=task48.inString(url);
        String onlyNumbers= task48.FindOnlyNumbers(str);
        System.out.println(task48.FindOnlyNumbers(str));
       System.out.println(task48.SummaAllNumbers(onlyNumbers));
        System.out.println(task48.NonRetry(onlyNumbers));

    }
}
