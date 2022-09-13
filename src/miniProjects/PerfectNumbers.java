package miniProjects;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write your number : ");
        int num = scan.nextInt();
        int sum = 1;

        if (num < 1) {
            System.out.println("İnvalid number");
        } else if (num == 1) {
            System.out.println("Your number isn't perfect.");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (num == sum) {
                System.out.println("Your number is perfect");
            } else System.out.println("Your number isn't perfect");
        }
    }
}
