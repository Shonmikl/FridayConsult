package _18_11_2022.students;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArIterMain {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Kiew");
        city.add("Moscow");
        city.add("Paris");
        city.add("London");
        city.add("Helsinki");
        city.add("Stockholm");
        city.add("Prague");

        Iterator<String> iterCity = city.iterator();

        while (iterCity.hasNext()) {
            System.out.println(iterCity.next());
        }
    }
}