package part6.Interface;

public class Interval implements IInterval {
    public static void main(String[] args) {
        IInterval first =new Interval();
        int FirstInterval = first.AllSecond(34,34,34);
        System.out.println(FirstInterval);
        System.out.println(first.AllMinuts(FirstInterval));
        System.out.println(first.AllHour(FirstInterval));
        IInterval second= new Interval();
        int SecondInterval=second.AllSecond(43,43,43);
        System.out.println(SecondInterval);
        System.out.println(second.AllMinuts(SecondInterval));
        System.out.println(second.AllHour(SecondInterval));
        IInterval equalz= new Interval();
        System.out.println(equalz.compareTo(FirstInterval,SecondInterval));
    }}