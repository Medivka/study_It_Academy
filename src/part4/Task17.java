package part4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        System.out.print("Vvedite 4islo: ");
        Scanner str = new Scanner(System.in);
        Double chislo = str.nextDouble();

        DecimalFormat formatter = new DecimalFormat();
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setGroupingSeparator(' ');
        formatter.setDecimalFormatSymbols(symbols);

        String s = formatter.format(chislo).toString();
        System.out.println(s);


    }
}
