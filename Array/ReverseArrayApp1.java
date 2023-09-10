package Lecture22;

import java.util.Scanner;

public class ReverseArrayApp1 {
    static int[] ReverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i=n-1; i>=0; i--) {
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
        int[] ans = ReverseArray(arr);
        System.out.print("The Reverse order of array (Approach 1) is : ");
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}

