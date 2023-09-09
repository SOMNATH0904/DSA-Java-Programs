package Lecture24;

import java.util.Scanner;

public class PrefixSumArray {

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] returnPrefixSumArrayWithCreatingNewArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i=1; i<n; i++){
            ans[i] = ans[i-1] + arr[i];
        }
        return ans;
    }

    static void returnPrefixSumArray(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = returnPrefixSumArrayWithCreatingNewArray(arr);
        System.out.println("The Prefix sum array after creating a new ans array is : ");
        printArray(ans);
        System.out.println();

        returnPrefixSumArray(arr);
        System.out.println("The Prefix sum array without creating a new array is : ");
        printArray(arr);
    }
}
