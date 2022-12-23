package _23_12_2022.matcherResult;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherResultEx1 {
    public static void main(String[] args) {

        //regex for checking
        String regex = "(ABCD)(AB)(CD)";

        //create Pattern
        Pattern pattern = Pattern.compile(regex);

        //get string to match
        String stringToBeMatched =
                "ABCD ABCE ABCDABCDFE";

        //create matcher
        Matcher matcher = pattern.matcher(stringToBeMatched);

        //get current matcher
        //todo
        MatchResult result
                = matcher.toMatchResult();

        //System.out.println("Current matcher: " + result);
        //System.out.println(result.group(1));

        //get the group
        while (matcher.find()) {
            System.out.println(matcher.end());
        }
    }
}