package Introdution;

import java.util.*;
public class java_datatypes {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        int j = sc.nextInt();

        for (int i = 0; i < j; i++) {
            try {
                long a = sc.nextLong();
                System.out.println(a + " can be fitted in:");

                if (a >= Short.MIN_VALUE && a <= Short.MAX_VALUE) {
                    System.out.println("""
                            * short
                            * int
                            * long""");
                } else if (a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE) {
                    System.out.println("""
                            * int
                            * long
                            """);
                }  else if (a >= Long.MIN_VALUE && a <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + "Can't be fitted anywhere.");
            }
        }
    }
}
