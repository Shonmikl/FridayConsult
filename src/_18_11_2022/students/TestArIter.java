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

       /* Iterator<String> iterCity = city.iterator();

        while (iterCity.hasNext()){
            System.out.println(iterCity.next());
        }
        */
        ArrayIterator arrayIterator = new ArrayIterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}