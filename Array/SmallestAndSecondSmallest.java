package Lecture21;

import java.util.Scanner;
public class SmallestAndSecondSmallest {

    static int smallestElement(int[] arr){
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int secondSmallest(int[] arr){
        int ans = smallestElement(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ans){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        ans = smallestElement(arr);
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
        System.out.println("The Smallest element present in an array is : "+smallestElement(arr));
        System.out.println("The Second Smallest element present in an array is : "+secondSmallest(arr));
    }
}


