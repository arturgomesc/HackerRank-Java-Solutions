import java.util.Scanner;
public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = scanner.nextInt();
        double double1 = scanner.nextDouble();
        scanner.nextLine();
        String string = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + string);
        System.out.println("Double: " + double1);
        System.out.println("Int: " + integer);
    }
}
