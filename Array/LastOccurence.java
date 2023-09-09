package Lecture20_Array;

import java.util.Scanner;
public class LastOccurence {
    public static int lastOccurenceNo(int arr[], int x){
        int last_element=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                last_element=i;
            }
        }
        return last_element;

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

        System.out.println("The last occurence of digit "+x+" in an array is : "+lastOccurenceNo(arr,x));
    }
}

