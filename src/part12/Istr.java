package part12;

import com.sun.jdi.IntegerValue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Istr {
    default Integer SummaAllNumbers(String strOnlyNumbers) {
        Integer summa = 0;
        char[] allnumbers = strOnlyNumbers.toCharArray();
        int[] array = new int[allnumbers.length];
        for (int i = 0; i < allnumbers.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(allnumbers[i]));
        }
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
        }
        return summa;
    }
    default LinkedHashSet NonRetry(String strOnlyNumbers){
        char[] allnumbers = strOnlyNumbers.toCharArray();
        Integer[] array = new Integer[allnumbers.length];
        for (int i = 0; i < allnumbers.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(allnumbers[i]));
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        Set<Integer> set = new LinkedHashSet<>(list);
        return (LinkedHashSet) set;

    }


    public default String FindOnlyNumbers(String str) {
        String str2 = str.replaceAll("[^0-9]", "");
        return str2;
    }

    default Integer quantityPunctuationmarks(String str) {
        int i = 0;

        Pattern pattern = Pattern.compile("[^\\w\\s]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            i++;
        }
        return i;
    }

    default Integer quantityWord(String str) {
        int i = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z]\\W");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            i++;
        }
        return i;
    }

    default String inString(String url) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(url);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = null;
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
