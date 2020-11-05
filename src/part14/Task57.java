package part14;

//import java.util.PriorityQueue;
//class   ochered{
//
//    PriorityQueue priorityQueue;
//    PriorityQueue createPriotityQueue(){
//            PriorityQueue priorityQueue=new PriorityQueue();
//            this.priorityQueue=priorityQueue;
//            for (int i = 0; i < 200; i++) {
//            int k = (int) (10+Math.random() * 100);
  //              System.out.printf("add: %d; ",k);
//            priorityQueue.add(k);
//        }
//        return priorityQueue;
//    }
//   synchronized PriorityQueue addElement(PriorityQueue priorityQueue){
//        this.priorityQueue=priorityQueue;
//        priorityQueue.add((int)Math.random()*100);
//        return priorityQueue;
//
//    }
//   synchronized PriorityQueue deleteElement(PriorityQueue priorityQueue){
//        this.priorityQueue=priorityQueue;
//        priorityQueue.remove();
//        return priorityQueue;
//
//    }
//}
//class Potrebitel implements Runnable{
//    ochered ochered;
//
//    public Potrebitel(ochered ochered) {
//        this.ochered= ochered;
//        new Thread(this).start();
//
//    }
//
//
//    @Override
//    public void run() {
//        ochered.deleteElement(ochered.priorityQueue);
  //      System.out.println(ochered.priorityQueue);
//
//    }
//}
//class Postavshik implements Runnable{
//    ochered ochered;
//
//    public Postavshik(ochered ochered) {
//        this.ochered = ochered;
//        new Thread(this).start();
//    }
//
//    @Override
//    public void run() {
//        ochered.addElement(ochered.priorityQueue);
  //      System.out.println(ochered.priorityQueue);
//
//    }
//}
//
//public class Task57 {
//
//    public static void main(String[] args)  {
//        int size=0;
//        ochered ochered=new ochered();
//        PriorityQueue priorityQueue=new PriorityQueue(ochered.createPriotityQueue());
//       new Potrebitel(ochered);
//       new Postavshik(ochered);
//       new Potrebitel(ochered);
//        System.out.println(priorityQueue);
//}}
//
//
//
//
//
//
