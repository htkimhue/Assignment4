package Assignment4;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = key.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
