package _03_02_2023.priBloQueue;

import java.util.Locale;
import java.util.concurrent.*;

import static java.lang.System.currentTimeMillis;

public class PBQ {
    private static final long START_TIME = currentTimeMillis();

    private static void enqueue(BlockingQueue<Integer> queue) {
        int element = ThreadLocalRandom.current().nextInt(10, 100);
        log("Calling queue.put(%d) (queue = %s)...", element, queue);
        try {
            queue.put(element);
            log("queue.put(%d) returned (queue = %s)", element, queue);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private static void dequeue(BlockingQueue<Integer> queue) {
        log("Calling queue.take() (queue = %s)...", queue);
        try {
            Integer element = queue.take();
            log("queue.take() returned %d (queue = %s)", element, queue);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static void log(String format, Object... args) {
        System.out.printf(
                Locale.US,
                "[%4.1fs] [%-16s] %s%n",
                (System.currentTimeMillis() - START_TIME) / 1000.0,
                Thread.currentThread().getName(),
                String.format(format, args));
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);

        for (int i = 0; i < 16; i++) {
            int delaySeconds = i * 3;
            pool.schedule(() -> dequeue(queue), delaySeconds, TimeUnit.SECONDS);
        }

        for (int i = 0; i < 16; i++) {
            int delayMillis = 3500 + i * 1000;
            pool.schedule(() -> enqueue(queue), delayMillis, TimeUnit.MILLISECONDS);
        }

        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
    }
}