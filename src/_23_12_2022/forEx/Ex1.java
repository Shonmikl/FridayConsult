package _23_12_2022.forEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

    public static void main(String[] args) {
        //(?:RE)
        Pattern pattern = Pattern.compile("(?:Mouse|Keyboard)Listener");
        Matcher matcher = pattern.matcher("MouseListener KeyboardListener");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
