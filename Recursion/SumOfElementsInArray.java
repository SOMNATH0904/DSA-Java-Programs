package Lecture37;

import java.util.Scanner;

public class SumOfElementsInArray {

    static int sumArray(int[] arr, int idx){
        int sum = arr[idx];
        if(idx == arr.length - 1) {
            return arr[idx];
        }
        int smallAns = sumArray(arr, idx + 1);
        return smallAns + sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        System.out.println("The Sum of elements in the array is : "+sumArray(arr,idx));

    }
}
