package Assignment4;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = key.nextInt();
        int count = 0;
        while (n != 0) {
            int temp = n % 10;
            count++;
            n /= 10;
        }
        System.out.println(count + " number");
    }

}
