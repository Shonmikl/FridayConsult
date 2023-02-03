package _27_01_2023.sync;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Exchanger;

public class CDL {
    private static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void m1() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Method m1 done");
        countDownLatch.countDown();
        System.out.println("countDownLatch :" + countDownLatch.getCount());
    }

    private static void m2() throws InterruptedException {
        Thread.sleep(1400);
        System.out.println("Method m2 done");
        countDownLatch.countDown();
        System.out.println("countDownLatch :" + countDownLatch.getCount());
    }

    private static void m3() throws InterruptedException {
        Thread.sleep(1900);
        System.out.println("Method m3 started");
        countDownLatch.countDown();
        System.out.println("countDownLatch :" + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend1("QQQ", countDownLatch);
        new Friend1("AAA", countDownLatch);
        new Friend1("WWW", countDownLatch);
        new Friend1("DDD", countDownLatch);
        new Friend1("FFF", countDownLatch);

        m1();
        m2();
        m3();
    }
}

class Friend1 extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public Friend1 (String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " is doing something");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}