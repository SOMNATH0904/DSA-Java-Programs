package Lecture33;

import java.util.Scanner;

public class NthFibonacci {

    static int fibonacci(int n){
        if(n == 0)      //Base case               //We can write this base case also as --> if(n == 0 || n ==1){ return n; }
            return 0;
        if(n == 1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("The "+n+"th term is : " + fibonacci(n));
    }

}
