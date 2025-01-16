package Assignment4;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the first: ");
        int n = key.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

}
