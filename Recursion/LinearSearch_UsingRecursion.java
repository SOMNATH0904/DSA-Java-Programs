package Lecture38;

import java.util.Scanner;

public class LinearSearch_UsingRecursion {

    static int returnIndex(int[] arr, int target, int idx){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return returnIndex(arr, target, idx + 1);
    }

    static boolean linearSearch(int[] arr, int target, int idx){
        if(idx == arr.length){                         //Base Case
            return false;
        }
        if(arr[idx] == target){                        //Self Work
            return true;
        }
        return linearSearch(arr, target, idx + 1);  //Recursive Work : It can also be written as --> if(linearSearch(arr, target, idx+1){ return true; }   else{ return false; }
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
        System.out.println("Enter the target value : ");
        int x = sc.nextInt();
        int idx = 0;
        if(linearSearch(arr, x, idx)) {
            System.out.println("FOUND");
        } else{
            System.out.println("NOT FOUND");
        }
        System.out.println("Found at index : "+returnIndex(arr, x, idx));
    }
}
