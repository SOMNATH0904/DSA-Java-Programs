package Lecture32;

import java.util.Scanner;

public class Print1ToN_UsingRecursion {

    static void PrintIncreasing(int n){
        if(n == 1){
            System.out.print(1+" ");
            return;
        }
        PrintIncreasing(n - 1); //Recursive Work
        System.out.print(n + " ");  //Self Work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("Increasing : ");
        PrintIncreasing(n);
    }

}
