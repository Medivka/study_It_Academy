package Part7;
import  java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task26 {
    public static void main(String[] args) {
        int i=0;
        String str= "asdasd,adasda,afafa-afaf.    afaf.afaf.";
        System.out.println(str);
        Pattern pattern = Pattern.compile("[^\\w\\s]");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            i++;
            System.out.print(matcher.group());}
        System.out.println("\n"+i);
    }
}
