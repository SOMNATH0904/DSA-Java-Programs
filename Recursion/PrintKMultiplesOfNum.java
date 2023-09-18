package Lecture35;

import java.util.Scanner;

public class PrintKMultiplesOfNum {

    static void printMultiples(int n, int k){
        if(k == 1) {        //Base Case
            System.out.print(n + " ");
            return;
        }
        printMultiples(n, k-1);      //Recursive Work
        System.out.print(n * k + " ");  //Self Work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Enter k multiples : ");
        int k = sc.nextInt();
        System.out.println("K Multiples of a Number are : ");
        printMultiples(n,k);
    }

}
