package _23_12_2022.patternException;

import java.util.regex.Pattern;

public class IP {
    void checkIp(String s) {
        String regex =
                //((25[0-5]|2[0-4]\\d|[01]\\d\\d)(\\.)){3}
                "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}"+
                        "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println("OK? " + Pattern.matches(regex, s));
    }

    public static void main(String[] args) {
        //0-255.0-255.0-255.0-255
        String ip1 = "255.13.236.12";
        String ip2 = "245.113.36.123";

        IP ip = new IP();
        ip.checkIp(ip1);
        ip.checkIp(ip2);
    }
}