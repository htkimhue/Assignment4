package Assignment4;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = key.nextInt();
        int reverse = 0, t = 0;
        while (n != 0) {
            t = n % 10;
            reverse = reverse * 10 + t;
            n /= 10;
        }
        System.out.println("Reverse: " + reverse);
    }

}
