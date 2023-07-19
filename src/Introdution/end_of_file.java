package Introdution;

import java.util.Scanner;
public class end_of_file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 1;

        while (scanner.hasNextLine()) {
            String token = scanner.nextLine();
            System.out.println(c + ": " + token);

            c++;
        }

        scanner.close();
    }
}
