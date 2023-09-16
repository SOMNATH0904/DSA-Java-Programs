package Lecture36;

import java.util.Scanner;

public class GCD_RecursiveApproach {

    static int GCD(int a, int b){
        if(b == 0)
            return a;
        return GCD(b, a % b);
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
