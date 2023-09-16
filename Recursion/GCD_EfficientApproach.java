package Lecture36;

import java.util.Scanner;

public class GCD_EfficientApproach {

    static int GCD(int a, int b){
        while(a % b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is : "+GCD(a,b));
    }
}
