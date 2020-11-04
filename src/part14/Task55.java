package part14;

public class Task55 extends Thread {
    public static void main(String[] args) {
        for (int i=0 ;i<10;i++) {
            Thread thread = new Thread();

            thread.start();
            synchronized (thread) {
                thread.notify();
            }
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName());
        }
    }
}
