package _23_12_2022.patternException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatterSyntaxExceptionsDemo {
    private static final String REGEX = "[";
    private static String INPUT = "The dog says meow " + "All dogs say meow";
    private static final String REPLACE = "cat";

    public static void main(String[] args) {
        try {
            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(INPUT);
            INPUT = matcher.replaceAll(REPLACE);
        } catch (PatternSyntaxException e) {
            System.out.println("PatterSyntaxException: ");
            System.out.println("Description: " + e.getDescription());
            System.out.println("Index: " + e.getIndex());
            System.out.println("Message: " + e.getMessage());
            System.out.println("Pattern: " + e.getPattern());
        }
    }
}