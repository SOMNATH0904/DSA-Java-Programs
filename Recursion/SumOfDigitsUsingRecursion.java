package Lecture34;

import java.util.Scanner;

public class SumOfDigitsUsingRecursion {

    static int sumOfDigits(int n){
        //Base Case
        if(n >= 0 && n <= 9) {                           // We can write this code as -->
            return n;                                   // if(n >= 0 && n <= 9) return n;
        }                                 // return sumOfDigits(n/10) + (n % 10);
        //Recursive Work --> SmallAns
        int smallAns = sumOfDigits(n/10);

        //Self Work
        int ans = smallAns + (n % 10);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Sum Of Digits is : "+sumOfDigits(n));
    }
}
