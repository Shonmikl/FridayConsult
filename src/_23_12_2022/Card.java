package _23_12_2022;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Card {
    public static void main(String[] args) {
        String myString =
                "98563215478523651222652"+
                "12584596587458521223985"+
                "96587452365840021126555";
        String s = " ";
        String cardEx = "98563215478523651222652";

        /**
         * Class card
         * Class CardGenerator -> return random String
         * Class Parser
         * Class Checker
         * Class NoValidCardException.class (Runtime)
         * Class FraudCardException.class (Runtime)
         */
        //Отдельный метод, который выдергивает из цифр месяц и год.
        //Отдельный метод, который сравнивает месяц и год из набора цифр с текущей датой и
        //если срок действия истек, выбрасывает NoValidCardException.class ( Runtime )

        Pattern pattern1 =
                Pattern.compile("(\\d{16})([0][1-9]|[1][0-2])(\\d{3})"); //09/25 not over than 4 years

        // 1234 5678 8888 4562 02/22 (999)
        Pattern pattern =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

        String cardString
                = matcher.replaceAll("$1 $2 $3 $4 $5/$6 ($7)");
        System.out.println(cardString);
    }
}
