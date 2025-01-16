package Assignment4;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = key.nextInt();
        int a = 0, b = 1;
        System.out.print("0 1 ");
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }

    }

}
