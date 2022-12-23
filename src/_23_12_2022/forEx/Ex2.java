package _23_12_2022.forEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java (?=7|8)");
        Matcher matcher = pattern.matcher("Java 7 Java 7");
        Matcher matcher1 = pattern.matcher("Java 9");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        if(!matcher1.find()) {
            System.out.println("not found");
        }
    }
}
