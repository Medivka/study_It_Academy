package sortirovkamassiva;

public class Shaker {
    static void shaker() {
        Integer array[] = new Integer[10];
        for(int i =0 ; i< array.length;i++){
            array[i]=(int)(Math.random()*10);
        System.out.print(array[i] + " ");}
        System.out.println("\n");


        int leftside=0;
        int rightside = array.length-1;
        do{
            for (int i =leftside;i<rightside;i++){
                if (array[i] > array[i+1]){
                        int temp = array[i];
                        array[i]= array[i+1];
                        array[i+1]=temp;
                }
            }
            rightside--;
            for (int i = rightside;i>leftside;i--){
                if (array[i]<array[i-1]){
                    int temp =array[i];
                    array[i]=array[i-1];
                    array[i-1]=temp;
                }
            }
            leftside++;
        }while (leftside<rightside);
        for(int i =0 ; i< array.length;i++){
            System.out.print(array[i]+ " ");}

    }

    public static void main(String[] args) {
       shaker();

    }
}
