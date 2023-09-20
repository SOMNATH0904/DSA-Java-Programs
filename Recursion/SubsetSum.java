package Lecture40;

import java.util.Scanner;

public class SubsetSum {

    static void printSubsetSum(int[] arr, int n, int idx, int currSubSum){
        if(idx == n){                           // BASE CASE
            System.out.print(currSubSum + " ");
            return;
        }

        printSubsetSum(arr, n, idx + 1, currSubSum + arr[idx]);     // INCLUDE
        printSubsetSum(arr, n, idx + 1, currSubSum);                          // EXCLUDE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        int currSubSum = 0;

        System.out.println("The Sum of Subsets will be : ");
        printSubsetSum(arr, n, idx, currSubSum);
    }
}
