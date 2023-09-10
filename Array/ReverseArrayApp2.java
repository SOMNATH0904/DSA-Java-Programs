package Lecture22;

import java.util.Scanner;

public class ReverseArrayApp2 {

    static void reversingArray(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
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
        System.out.println("Reverse order of an array is : ");
        reversingArray(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

}

