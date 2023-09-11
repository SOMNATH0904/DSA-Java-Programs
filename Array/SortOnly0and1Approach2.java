package Lecture23;

import java.util.Scanner;

public class SortOnly0and1Approach2 {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortOnly0And1InPlace(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left < right){
            if(arr[left] == 1 && arr[right] ==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sortOnly0And1InPlace(arr);
        System.out.println("Sorted array of only 0 and 1 is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
