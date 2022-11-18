package _18_11_2022.students;

import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorEx implements Spliterator<SpliteratorEx> {

    @Override
    public boolean tryAdvance(Consumer<? super SpliteratorEx> action) {
        return false;
    }

    @Override
    public Spliterator<SpliteratorEx> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return 0;
    }

    @Override
    public int characteristics() {
        return 0;
    }
}