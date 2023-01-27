package _27_01_2023.sync;

import lombok.AllArgsConstructor;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore box = new Semaphore(1);
        Person p1 = new Person("QQ", box);
        Person p2 = new Person("AA", box);
        Person p3 = new Person("WW", box);
        Person p4 = new Person("SS", box);
        Person p5 = new Person("DD", box);
        Person p6 = new Person("VV", box);
        Person p7 = new Person("GG", box);
        Person p8 = new Person("FF", box);
        Person p9 = new Person("HH", box);
    }
}


class Person extends Thread {
    String name;
    private Semaphore box;

    public Person(String name, Semaphore box) {
        this.name = name;
        this.box = box;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting for....");
            Thread.sleep(2000);
            box.acquire();
            System.out.println(name + " is using the phone....");
            Thread.sleep(2000);
            System.out.println(name + " has finished the call.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            box.release();
        }
    }
}