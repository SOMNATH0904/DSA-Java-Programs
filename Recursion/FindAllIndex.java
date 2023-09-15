package Lecture38;

import java.util.Scanner;

public class FindAllIndex {

    static void findAllIndex(int[] arr, int target, int idx){
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == target){
            System.out.print(idx + " ");
        }
        findAllIndex(arr, target, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value : ");
        int x = sc.nextInt();
        int idx = 0;

        System.out.println("Target is present at index : ");
        findAllIndex(arr, x, idx);

    }
}
