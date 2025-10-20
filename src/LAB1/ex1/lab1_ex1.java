package LAB1.ex1;

import java.util.Scanner;

public class lab1_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lungimea:");
        int lungimea = sc.nextInt();
        System.out.println("latimea:");
        int latimea = sc.nextInt();

        System.out.println("pertimetrul este "+2*(lungimea+latimea));
        System.out.println("aria este "+lungimea*latimea);
    }
}
