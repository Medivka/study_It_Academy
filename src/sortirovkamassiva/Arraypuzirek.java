package sortirovkamassiva;

public class Arraypuzirek {


    static void array() {
        Integer array[] = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

      for (int i = 0; i < array.length - 1; i++) {
          for (int j = (array.length - 1); j > i; j--) {
              if (array[j - 1] > array[j]) {
                  int temp = array[j - 1];
                  array[j - 1] = array[j];
                  array[j] = temp;

              }
          }

      }
      for (int i=0;i<array.length;i++)
           System.out.print(array[i]+ " ");

    }

    public static void main(String[] args) {
        array();


    }
}


