package Lecture22;

// Ques : Rotate the given array 'a' by K steps, where k is a non-negative.
// Note : K can be greater than n as well.

import java.util.Scanner;

public class RotatingArray {        //Rotating an array by K Steps
    //Where K steps = K % n where n is length of array

    static int[] RotateArrayKSteps(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for(int i=n-k; i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
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
        int[] ans = RotateArrayKSteps(arr,k);
        System.out.println("Array after rotating "+k+" steps is : ");
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}

