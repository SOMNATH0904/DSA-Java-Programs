package Lecture34;

import java.util.Scanner;

public class CountOfDigits {

    static int countOfDigits(int n){
        if(n == 0)
            return 0;
        return 1 + countOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Count of Digits in "+n+" is : "+countOfDigits(n));

    }
}
