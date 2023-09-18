package Lecture33;

import java.util.Scanner;

public class PrintFactorial {

    static int factorial(int n){
        if(n == 0)
            return 1;
        int fact = n * factorial(n-1);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Factorial of "+n+" is : " + factorial(n));
    }
}
