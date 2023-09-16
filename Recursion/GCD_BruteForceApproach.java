package Lecture36;

import java.util.Scanner;

public class GCD_BruteForceApproach {

    static int GCD(int a, int b){
        for(int i = a; i >= 1; i--){
            if(a % i == b % i){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.println("The GCD of "+a+" and "+b+" is : "+GCD(a,b));
    }
}
