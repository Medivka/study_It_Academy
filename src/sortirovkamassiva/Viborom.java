package sortirovkamassiva;


public class Viborom {
        public static void viborom() {
        Integer array[] = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        int element, temp;

        for (int i = 0; i < array.length - 1; i++) {
            element = i;
            for (int index = i + 1; index < array.length; index++) {
                if (array[index] < array[element])
                    element = index;
            }

            temp = array[element];
            array[element] = array[i];
            array[i] = temp;

        }
        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        viborom();
    }
}
