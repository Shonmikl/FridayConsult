package _18_11_2022.students;

import java.util.Iterator;
import java.util.List;

/**
 * который будет имплементировать интерфейс(Iterator) по заданному массиву обьектов.
 * Создать массив тестовых обьектов ( 7 штук ) и используя реализованный класс
 * ArrayIterator
 * вывести на экран содержимое массива.
 */

public class ArrayIterator implements Iterator<Object> {
    List<String> list;
    private int cursor;

    public ArrayIterator(List<String> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor >= 0 && cursor < list.size();
    }

    @Override
    public Object next() {
        return list.get(cursor++);
    }

    @Override
    public void remove() {
        list.remove(cursor--);
    }
}