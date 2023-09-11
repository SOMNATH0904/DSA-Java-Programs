package Lecture23;

import java.util.Scanner;

public class SortOnly0and1Approach1 {

    static void sortOnly0And1(int[] arr, int n){
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        for(int i=0; i<n; i++) {
            if(i<count){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
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
        System.out.println("Sorted array of only 0 and 1 is : ");
        sortOnly0And1(arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
