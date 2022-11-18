package _18_11_2022.students;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

/**
 * Predicate<T> boolean(T t) - проверяет удовлетворяет ли состояние объекта условию
 * Consumer<T> void(T t) - выполняет действия без возврата результата
 * Function<T, R> R (T t) - принимает в качестве аргумента значение
 * одного типа и возвращает другое значение
 * Supplier<T> T() - возвращает результат без передачи параметра
 * UnaryOperator<T> - T(T t) - принимает в качестве параметра значение одного типа
 * и возвращает значение того же типа
 * BinaryOperator<T> T apply(T t1, T t2) принимает в качестве параметра два объекта типа T, выполняет
 * над ними бинарную операцию и возвращает ее результат также в виде объекта типа T:
 */

public class StudentInfo {
    void testStudent(ArrayList<Student> al, StudentCheck sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sergey", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nik", 'm', 28, 2, 7.4);
        Student s3 = new Student("Elena", 'w', 32, 1, 9.0);
        Student s4 = new Student("Petr", 'm', 30, 4, 6.0);
        Student s5 = new Student("Marya", 'w', 25, 5, 7.7);

        ArrayList<Student> student = new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);

        StudentInfo info = new StudentInfo();
        info.testStudent(student, s -> s.getAvgGrade() > 8);

        int[] arr = {3, 21, 65, 4, 98, 7, 65, 4};
        Arrays.stream(arr)

                .map(el -> el * 3)
                .distinct()
                .forEach(System.out::println);
                //reduce((acc, el) -> acc + el)
        long a = System.currentTimeMillis();
    }
}

@FunctionalInterface
interface StudentCheck {
    boolean check(Student s);
}