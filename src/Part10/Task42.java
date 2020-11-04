package Part10;

import java.util.HashMap;
import java.util.Map;

public class Task42 {
    public static void main(String[] args) {
        String str= "asdasd dadasd sad asd ass das a, das sd asd as da ass sd.. as sd!!! asd as da ";
        String str1 = str.replaceAll("[^a-z]", " ");
        String str2 = str1.replaceAll(" +", " ");
        System.out.println(str2);
        String[] word= str2.split("[^a-z]");
        Map<String, Integer> text= new HashMap<>();
        int quantity;
        for (int i=0;i< word.length;i++){
            quantity=0;
            for(int j=0;j< word.length;j++){
                if (word[i].equals((word[j]))){
                quantity++;}
                }
            text.put(word[i],quantity );
            }
        System.out.println(text);

        }

    }
