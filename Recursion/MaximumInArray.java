package Lecture37;

import java.util.Scanner;

public class MaximumInArray {

    static int returnMaximum(int[] arr, int idx) {
        if(idx == arr.length - 1) {
            return arr[idx];
        }
        int smallAns = returnMaximum(arr, idx + 1);
        return Math.max(arr[idx], smallAns);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an Array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        System.out.println("The Maximum element in the Array is : "+returnMaximum(arr,idx));
    }
}

