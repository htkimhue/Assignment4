package Assignment4;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = key.nextInt();
        int nguoc = 0;
        int goc = n;
        while (n != 0) {
            int temp = n % 10;
            nguoc = nguoc * 10 + temp;
            n /= 10;
        }
        if (goc == nguoc) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }

}
