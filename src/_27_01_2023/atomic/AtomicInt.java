package _27_01_2023.atomic;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicInt {
    static AtomicInteger counter = new AtomicInteger(0);
    //static AtomicBoolean aBoolean = new AtomicBoolean(false);

    //static AtomicReference<String> atomicReference = new AtomicReference<>();

    public static void increment() {
        counter.incrementAndGet();
//        aBoolean.getOpaque();
//        aBoolean.get();
//        aBoolean.getAcquire();
        //counter.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        //atomicReference.
        //counter.lazySet(5);
        Thread thread1 = new Thread(new MuRun());
        Thread thread2 = new Thread(new MuRun());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }

}

class MuRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            AtomicInt.increment();
        }
    }
}