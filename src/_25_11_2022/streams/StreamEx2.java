package _25_11_2022.streams;

import _18_11_2022.students.Faculty;
import _18_11_2022.students.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        Student s1 = new Student("Sergey", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nik", 'm', 28, 2, 7.4);
        Student s3 = new Student("Elena", 'w', 32, 2, 9.0);
        Student s4 = new Student("Petr", 'm', 30, 4, 6.0);
        Student s5 = new Student("Marya", 'w', 21, 5, 7.7);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        Faculty f1 = new Faculty("C++");
        Faculty f2 = new Faculty("Java");
        f1.addStOnF(s1);
        f1.addStOnF(s2);
        f1.addStOnF(s3);
        f2.addStOnF(s4);
        f2.addStOnF(s5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        int[] array = {6, 54, 32, 16, 5, 4, 6, 98, 74, 56};

//        System.out.println(Arrays.stream(array)
//                .distinct()
//                .peek(System.out::println)
//                .map(el -> el *10)
//                .peek(System.out::println)
//                .count());

//        facultyList.stream()
//                .flatMap(f -> f.getStudentsOnFaculty()
//                        .stream())
//                        .forEach(s -> System.out.println(s.getName()));

        Map<Integer, List<Student>> listMap =
                studentList.stream()
                        .collect(Collectors.groupingBy(Student::getCourse));
        for (Map.Entry<Integer, List<Student>> entry : listMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //todo List<String> fruits = Stream.of("apple", "banana", "lemon", "orange")
        //{a=apple, b=banana, l=lemon, o=orange}


    }
}