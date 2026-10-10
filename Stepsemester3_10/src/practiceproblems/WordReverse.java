package practiceproblems;
import java.util.Scanner;
class WordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();

        System.out.println(rev + (s.equals(rev) ?
                " - palindrome" : " - not a palindrome"));
        sc.close();
    }
}