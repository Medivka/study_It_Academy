package part6;


import java.util.Arrays;

class Interval24 {
    private static Integer hours;
    private static Integer minets;
    private static Integer second;
    private static Integer allsecond;


    Interval24(Integer hours, Integer minets, Integer second) {
        this.hours = hours;
        this.minets = minets;
        this.second = second;
    }
    static void Seconds() {
        System.out.println(second + " second");
    }
     static void Minets() {
        System.out.println(minets + " minuts");
    }
     static void Hours() { System.out.println(hours + " hour");
    }
    private static void Second() {
        int minets1 = Interval24.minets;
        int hours1 = Interval24.hours;
        int second1 = Interval24.second;
        allsecond = hours1 * 3600 + minets1 * 60 + second1;
        System.out.println(allsecond + "  All second");
    }
    public static class IntervalTask24 {
        public static void main(String[] args) {
            Interval24 first = new Interval24(34, 34, 34);
            Integer[] array1 = new Integer[]{hours, minets, second};
            String str1 = Arrays.toString(array1);
            System.out.println(Arrays.toString(array1));
            Second();
            Hours();
            Minets();
            Seconds();
            Interval24 seconds = new Interval24(234, 43, 43);
            Integer[] array2 = new Integer[]{hours, minets, second};
            String str2 = Arrays.toString(array2);
            System.out.println(Arrays.toString(array2));
            Second();
            int equals = str1.compareTo(str2);
            System.out.println(equals);
        }
    }
}




