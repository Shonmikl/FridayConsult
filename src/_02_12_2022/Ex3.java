package _02_12_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex3 {
    public static void main(String[] args) {
//        String s = "Java";
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if("Java".equals(list.get(i))) {
//                System.out.println("!");
//            }
//        }

        int[] arr = {};
        int a = Arrays.stream(arr).reduce(Integer::sum).orElse(1);
        System.out.println(a);
    }
}