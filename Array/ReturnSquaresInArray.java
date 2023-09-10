package Lecture23;

import java.util.Scanner;

public class ReturnSquaresInArray {

    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n - 1;
        int k = 0;
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
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
        int[] ans = sortSquares(arr);
        reverse(ans);
        System.out.println("The Squares of all numbers present in an array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
