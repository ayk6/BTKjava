package miniProjects;

import java.util.Scanner;

public class FriendNumbers {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("First number : ");
        int n1= scan.nextInt();
        System.out.print("2nd number : ");
        int n2= scan.nextInt();

        if (n1<1 || n2<1){
            throw new Exception("Numbers must be positive.");
        }

        int sum1 = 0,sum2=0;

        for (int i =1;i<n1;i++){
            if (n1%i==0){
                sum1+=i;
            }
        }
        for (int i =1;i<n2;i++){
            if (n2%i==0){
                sum2+=i;
            }
        }

        if (n1==sum2 && n2==sum1){
            System.out.println("Your numbers are friends.");
        } else System.out.println("Your numbers are not friends.");


    }
}
