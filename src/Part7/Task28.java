package Part7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {

        String str = "asdhjahdr hasjsdhaja 343 ,.,232[[][ //hjasdb hjkasdjkao skdajt adjkaa adjkajde t .";
        //System.out.println(str);
        Pattern pattern = Pattern.compile("[a-zA-Z]\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())

            System.out.print(matcher.group());
    }
}
