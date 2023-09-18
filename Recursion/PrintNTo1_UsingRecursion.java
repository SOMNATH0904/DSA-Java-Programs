package Lecture32;

import java.util.Scanner;

public class PrintNTo1_UsingRecursion {

    static void printDecreasing(int n){
        if(n == 1){                 //Base Case
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");  //Self Work
        printDecreasing(n-1);   //Recursive Work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("Decreasing : ");
        printDecreasing(n);
    }
}
