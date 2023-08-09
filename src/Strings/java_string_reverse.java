package Strings;
import java.util.Scanner;
public class java_string_reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder reversed = new StringBuilder();

        String s = scanner.next();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        if (s.equalsIgnoreCase(String.valueOf(reversed))) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
