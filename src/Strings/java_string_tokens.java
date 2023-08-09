package Strings;

import java.util.Scanner;
public class java_string_tokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        s = removeLeadingNonLetters(s);

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] palavras = s.split("[^a-zA-Z]+");

        System.out.println(palavras.length);

        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }
    }
    private static String removeLeadingNonLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }
}


