package Lecture23;

import java.util.Scanner;

public class SortInDecsending {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static int[] sortInDescending(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        return arr;
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

        int[] ans = sortInDescending(arr);
        reverse(ans);
        System.out.println("Array is Descending order is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");;
        }
    }
}
