package Lecture34;

import java.util.Scanner;

public class AToThePowerB_UsingRecursion_2ndApproach {

    static int power(int a, int b){
        if(b == 0)
            return 1;

        int smallPow = power(a,b/2);
        if(b % 2 == 0)                      //For Even Case
            return smallPow * smallPow;

        return a * smallPow * smallPow;      //For Odd Case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        System.out.println(a+" to the power "+b+" is : "+power(a,b));
    }
}
