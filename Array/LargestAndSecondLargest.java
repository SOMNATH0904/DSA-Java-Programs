package Lecture21;

import java.util.Scanner;
public class LargestAndSecondLargest {
    static int largestElement(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int secondLargest(int[] arr){
        int ans = largestElement(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ans){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        ans = largestElement(arr);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("The Array elements are : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Largest element present in an array is : "+largestElement(arr));
        System.out.println("The Second Largest element present in an array is : "+secondLargest(arr));
    }
}


