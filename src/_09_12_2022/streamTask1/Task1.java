package _09_12_2022.streamTask1;

import _18_11_2022.students.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Task1 {
    public static void main(String[] args) {
        Student s1 = new Student("Sergey", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nik", 'm', 28, 2, 7.4);
        Student s3 = new Student("Elena", 'w', 32, 1, 9.0);
        Student s4 = new Student("Petr", 'm', 30, 4, 6.0);
        Student s5 = new Student("Marya", 'w', 25, 5, 7.7);

        List<Student> studentList = new ArrayList<>();

        List<Student> list = studentList.stream()
                .collect(Collectors.toList());

        Set<Student> set = studentList.stream()
                .collect(Collectors.toSet());

        List<Student> linked = studentList.stream()
                .collect(Collectors.toCollection(LinkedList::new));

        Map<Double, Student> map = studentList.stream()
                .collect(Collectors.toMap(st -> st.getAvgGrade(), st -> st));


        /**
         * Посчитать количество больших и маленьких букв
         * true - 10
         * false - 33
         */
        String s = "Heavily trAiled, huGely Anticipated - but did HArry & Meghan make good TV";
        s.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(groupingBy(Character::isLowerCase, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + ": " + v));

        //Yulia version
        Map<Object, Long> collect = Arrays.stream(s.split(""))
                .filter(a -> a.matches("\\w"))
                .filter(a -> !a.matches("-"))
                .collect(Collectors.groupingBy(
                        a -> a.matches("[A-Z]"),
                        Collectors.counting()
                ));
        System.out.println(collect);


        /**
         * Вывести все строки/строку с максимальной длиной используя Optional
         * {"qw", "qqq", "edcd", "ertyuy"} -> "ertyuy";
         * {"qw", "qqq", "edcd", "poiu"} -> "edcd", "poiu";
         */

        Stream<String> str = Stream.of("Unless", "you", "are", "an", "individual",
                "member", "of", "the",
                "Royal", "Family", "in", "which", "case", "you", "might", "be", "opening",
                "the", "champagne",
                "a", "drink", "we", "learnt", "from", "this", "new", "show", "that", "Harry",
                "doesn't", "usually", "enjoy");

        //Optional<Map.Entry<Integer, List<String>>> max =



        //System.out.println(max);
    }
}
