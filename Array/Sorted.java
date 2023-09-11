package Lecture20_Array;

import java.util.Scanner;
public class    Sorted {
    public static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("The array elements are : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Is the given Array is Sorted : "+isSorted(arr));
    }
}
