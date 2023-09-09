package Lecture23;

import java.util.Scanner;

public class EvenThenOddPrintArray {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printEvenThenOdd(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left < right){
            if((arr[left] % 2 == 1) && (arr[right] % 2 == 0)){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
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
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printEvenThenOdd(arr);
        System.out.println("Array elements in Even then odd are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
