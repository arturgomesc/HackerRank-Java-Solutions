package Inhinerance_II;

public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("my superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.print(adder.add(10,32) + " " + adder.add(10, 3) + " " + adder.add(10, 10));
    }
}
