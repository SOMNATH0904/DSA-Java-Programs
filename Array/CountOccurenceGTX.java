package Lecture20_Array;

import java.util.Scanner;
public class CountOccurenceGTX {
    public static int countOccurenceGTx(int arr[], int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("The array elements are : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element : ");
        int x = sc.nextInt();
        System.out.println("The number of occurenceof digit "+x+" in given array is : "+countOccurenceGTx(arr,x));
    }
}

