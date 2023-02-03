package _03_02_2023.phaser;

import java.util.concurrent.Phaser;

public class PhaserEx {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        new A(phaser);
        new B(phaser);
        new B(phaser);
    }
}

class A extends Thread {
    Phaser phaser;

    public A(Phaser phaser) {
        this.phaser = phaser;
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(600);
                System.out.println(getName() + " AAAA");
                System.out.println("AAAA is waiting for -> thread [" + phaser.getUnarrivedParties() + "]");
                phaser.arriveAndAwaitAdvance();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread {
    Phaser phaser;

    public B(Phaser phaser) {
        this.phaser = phaser;
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1500);
                System.out.println(getName() + " BBBB");
                phaser.arriveAndAwaitAdvance();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class C extends Thread {
    Phaser phaser;
    public C(Phaser phaser) {
        this.phaser = phaser;
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(900);
                System.out.println(getName() + " CCCC");
                phaser.arriveAndAwaitAdvance();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}