package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class java_anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.next();
        String s2 = scanner.next();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
        } else {
            char[] char1 = s1.toLowerCase().toCharArray();
            char[] char2 = s2.toLowerCase().toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);

            if (Arrays.equals(char1, char2)) {
                System.out.println("Anagrams");
            } else System.out.println("Not Anagrams");
        }
    }
}
