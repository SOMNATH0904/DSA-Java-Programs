package Lecture24;

import java.util.Scanner;

public class SuffixSumArray {

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] returnSuffixSumArrayWithCreatingNewArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            ans[i] = ans[i+1] + arr[i];
        }
        return ans;
    }

    static void returnSuffixSumArray(int[] arr){
        int n = arr.length;
        for(int i=n-2; i>=0; i--){
            arr[i] = arr[i+1] + arr[i];
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

        int[] ans = returnSuffixSumArrayWithCreatingNewArray(arr);
        System.out.println("The Suffix Sum array after creating a new ans array is : ");
        printArray(ans);
        System.out.println();

        returnSuffixSumArray(arr);
        System.out.println("The Suffix Sum array without creating a new array is : ");
        printArray(arr);

    }
}

