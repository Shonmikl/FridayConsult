package _18_11_2022.students;

import java.util.ArrayList;
import java.util.List;

public class TestArIter {
    public static void main(String[] args) {
        List<String> city = new ArrayList<>();
        city.add("Kiew");
        city.add("Moscow");
        city.add("Paris");
        city.add("London");
        city.add("Helsinki");
        city.add("Stockholm");
        city.add("Prague");

        ArrayIterator arrayIterator = new ArrayIterator(city);
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}