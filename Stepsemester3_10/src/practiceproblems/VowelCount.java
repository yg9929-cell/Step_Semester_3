package practiceproblems;
import java.util.Scanner;
class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if ("aeiou".indexOf(ch) != -1)
                v++;
            else
                c++;
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        sc.close();    }
}