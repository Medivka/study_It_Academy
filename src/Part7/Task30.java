package Part7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    private static void poisk(){
        String str;
        str = "<p class=\"mw-empty-elt\" </p>  dfda<pdsf ffsdfs>  </p> c ddfs <p    jhjsdfn> <pdfsdfs    >"  ;
        Pattern pattern = Pattern.compile("<p (.+?)>");
        Matcher matcher = pattern.matcher(str);


            System.out.println(matcher.replaceAll("<p>"));}



    public static void main(String[] args) {
        poisk();
    }
}
