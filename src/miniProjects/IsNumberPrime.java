package miniProjects;

import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your number : ");
        int num = scan.nextInt();
        boolean isPrime = true;

        if (num < 1) {
            System.out.println("İnvalid number");
        } else if (num == 1) {
            System.out.println("Your number isn't prime.");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                System.out.println("Your number is prime.");
            } else {
                System.out.println("Your number isn't prime.");
            }
        }
    }
}
