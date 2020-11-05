package part14;

import java.util.concurrent.TransferQueue;

public class Task56 extends Thread {
    public static void main(String[] args) {
        final String Text1 = "aaaaaaaa";
        final String Text2 = "bbbbbbbb";
        final String Text3 = "cccccccc";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (Text1) {
                    System.out.println(Text1);
                    try {
                        Task56.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (Text2) {
                    }
                }
            }
        };
        Thread t2 = new Thread() {

            public void run() {
                synchronized (Text2) {
                    System.out.println(Text2);
                    try {
                        Task56.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (Text3) {
                    }
                }
            }
        };
        Thread t3 = new Thread() {
            public void run() {
                synchronized (Text3) {
                    System.out.println(Text3);
                    try {
                        Task56.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    synchronized (Text1) {
                    }
                }
            }
        };
        t1.start();
        t2.start();
        t3.start();

    }
}
