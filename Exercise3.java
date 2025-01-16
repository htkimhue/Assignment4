package Assignment4;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = key.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);
    }

}
