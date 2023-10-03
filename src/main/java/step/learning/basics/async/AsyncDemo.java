package step.learning.basics.async;

import com.sun.xml.internal.ws.api.server.ThreadLocalContainerResolver;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

public class AsyncDemo {
    private double sum;
    private Object sumLocker = new Object();

    public class MonthRate implements Runnable {
        public final int month;

        public MonthRate(int month) {
            this.month = month;
        }

        @Override
        public void run()
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {}

            double p = 0.1;
            synchronized (sumLocker) {

                sum = sum * (1.0 + p);
                System.out.printf("month: %d, percent: %.2f, sum: %.2f%n", month, p, sum);
            }
        }
    }
    public void run() {
        System.out.println( "Async demo" ) ;
        //multiThreadDemo();
        sum = 100;
        for(int i = 0; i <= 12; i++)
        {
            new Thread(new MonthRate(i + 1)).start();
        }
        //Hw();
    }
    private void multiThreadDemo(){
        Thread thread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            System.out.println("Thread starts");
                            Thread.sleep(2000);
                            System.out.println("Thread finishes");
                        }
                        catch (InterruptedException ex){
                            System.err.println("Sleeping broken" + ex.getMessage());
                        }
                    }
                }
        );
        try {
            thread.join();
        }
        catch (InterruptedException ex){
            System.err.println("Thread joining interrupted" + ex.getMessage());
        }
        //      thread.start();
        System.out.println("multiThreadDemo() finishes");
    }

    private void Hw(){
        final CountDownLatch latch = new CountDownLatch(3);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1 start");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("1 finish");
                latch.countDown();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("2 start");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("2 finish");
                latch.countDown();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("3 start");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("3 finish");
                latch.countDown();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("final");
    }
}
