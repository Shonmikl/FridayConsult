package _20_01_2023.multyThreading;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {
    public static void main(String[] args) {
        //List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        //Queue<String> queue = new LinkedList<>();

        Thread producer = new Thread(() -> {
            String[] words = new String[]{"123", "abc", "qwerty", "queue", "stack", "array", "list",
                    "Bookmark", "the", "page", "and", "come", "back", "for", "updates"};

            for (int i = 0; i < words.length && !Thread.interrupted(); ) {
                try {
                    Thread.sleep(1000);
                    queue.put(words[i]);
                    System.out.println("producer: записал в очередь [" + words[i] + "], число элементов в очереди: [" + queue.size() + "]");
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()) {
                try {
                    sb.setLength(0);
                    Thread.sleep(4000);
                    sb.append(queue.take());
                    System.out.println("consumer: обработал из очереди [" + sb.reverse() + "], число элементов в очереди: [" + queue.size() + "]");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer.start();
    }
}