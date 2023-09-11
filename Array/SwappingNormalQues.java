package Lecture22;

import java.util.Scanner;

public class SwappingNormalQues {
    static void SwapUsingTempVariable(int a , int b){    // Swapping two numbers using a Temporary variable
        System.out.println("Before Swapping --> Value of a is : "+a+" and Value of b is : "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping --> Value of a is : "+a+" and Value of b is : "+b);
    }
    static void SwapWithoutExtraVariable(int a, int b){
        System.out.println("Before Swapping --> Value of a is : "+a+" and Value of b is : "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping --> Value of a is : "+a+" and Value of b is : "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no : ");
        int b = sc.nextInt();
        SwapUsingTempVariable(a,b);
        SwapWithoutExtraVariable(a,b);
    }
}

