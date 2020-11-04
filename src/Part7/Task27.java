package Part7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        int i=0;
        String str= "   AAAA ASA  dasd .///asd///adhjashdja dhasjdhasjs-das fsf/-dsaas-sda dasd-asd -dasd -sd ";
        System.out.println(str);
        Pattern pattern = Pattern.compile("[a-zA-Z]\\W");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            i++;
          }
        System.out.println(i);
    }
}
