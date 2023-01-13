package _23_12_2022.forEx;

public class Ex3 {
    public static void main(String[] args) {
        String s = "US man uses 'intuition' to     win lottery  six  times";
        System.out.println(s);

       // s = s.replace("man", "woman");
       // s = s.replaceAll(" {2,}", " ");
        s = s.replaceFirst("\\bt\\w+", "***");

        System.out.println(s);
    }
}