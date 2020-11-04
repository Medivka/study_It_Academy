package part12;

public interface Itask49 {
    default Integer MiddleArithmetick(String str) {
        int k = 0;
        Integer middleArithmetik = 0;
        char[] allnumbers = str.toCharArray();
        int[] array = new int[allnumbers.length];
        for (int i = 0; i < allnumbers.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(allnumbers[i]));
        }
        for (int i = 0; i < array.length; i++) {
            middleArithmetik += array[i];
            k++;
        }
        return middleArithmetik/k ;
    }
}
