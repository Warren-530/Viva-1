package viva1_q2;

import java.util.Scanner;

public class Viva1_Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        int a, b;
        boolean constrain;
        int step = 0;

        do {
            System.out.print("Enter 3 integers: ");
            n = sc.nextLong();
            a = sc.nextInt();
            b = sc.nextInt();
            constrain = ((n >= 1) && (n <= Math.pow(10, 9)) && (a >= 1) && (a <= n) && (b >= 2) && (b <= Math.pow(10, 5)));

            if (!constrain) {
                System.out.println("Invalid integer, please enter again!");
            }
        } while (!constrain);

        
        while (n != 1) {
            if (n % b == 0) {
                n = n / b;
            } else {
                n = n - a;
            }
            step += 1;

            if (n <= 0) {
                step = -1;
                break;
            }
        }
        
        System.out.println("Minimum number of steps: " +step);

    }

}
