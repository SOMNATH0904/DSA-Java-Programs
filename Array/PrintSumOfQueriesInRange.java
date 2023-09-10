package Lecture24;

import java.util.Scanner;

public class PrintSumOfQueriesInRange {

    static void prefixSumArray(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter array elements : ");
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        prefixSumArray(arr);

        System.out.println("Enter Q queries : ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter Range to find sum : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = arr[r] - arr[l-1];
            System.out.println("Sum from range "+l+" to "+r+" is : "+ans);
        }
    }
}

