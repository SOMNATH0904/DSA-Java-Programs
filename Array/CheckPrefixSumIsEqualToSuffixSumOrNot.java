package Lecture24;

import java.util.Scanner;

public class CheckPrefixSumIsEqualToSuffixSumOrNot {

    static int totalSumArray(int[] arr){
        int totalSum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum = totalSumArray(arr);
        int prefSum = 0;
        for(int i=0; i<arr.length; i++){
            prefSum += arr[i];
            int suffSum = totalSum - prefSum;
            if(suffSum == prefSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter array elements : ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal Partition Possible : "+equalSumPartition(arr));

    }
}
