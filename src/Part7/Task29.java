package Part7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    private static void  poisk(){ String str = "aa0x24FFbbbz0Xsadqweq231230xA4141157857433242A65";
        //System.out.println(str);
        Pattern pattern = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())

            System.out.println(matcher.group());}
    public static void main(String[] args) {
        poisk();

    }
}
