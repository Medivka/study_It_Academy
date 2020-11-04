package part5;

public class Task20 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "  ");
        }
        int maxMark = array[0], nomerElementa = 0;
        for (int k = 0; k < array.length; k++) {
            if (maxMark < array[k]) {
                nomerElementa = k;
                maxMark = array[k];
            }
        }
        System.out.println("\n max element = " + maxMark + " poriadkovii nomer " + nomerElementa);
    }
}

