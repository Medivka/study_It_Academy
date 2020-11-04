package part12;


public class Task47 implements Istr {
    public static void main(String[] args)  {
       String url= "D:/HelloJava.txt.txt";
        Task47 task47=new Task47();
        String str= task47.inString(url);
        System.out.println(task47.quantityWord(str));
        System.out.println(task47.quantityPunctuationmarks(str));

    }
}
