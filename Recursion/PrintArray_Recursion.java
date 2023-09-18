package Lecture37;

import java.util.Scanner;

public class PrintArray_Recursion {

    static void printElements(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printElements(arr,idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        System.out.println("The Elements of an array are : ");
        printElements(arr,idx);


    }
}
