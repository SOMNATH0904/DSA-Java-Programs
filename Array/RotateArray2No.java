package Lecture22;

// Ques : Rotate the given array 'a' steps, where k is a non-negative without using extra space.
// Note : K can be greater than n as well.

import java.util.Scanner;

public class RotateArray2No {

    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr,0, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array elements are : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K (Rotate) : ");
        int k = sc.nextInt();
        System.out.println("Original array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array after Rotating "+k+" Steps is : ");
        rotateInPlace(arr,k);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

