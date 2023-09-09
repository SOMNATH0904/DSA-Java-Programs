package Lecture21;

import java.util.Scanner;
public class PairSumTriplet {
    static int PairSumTriplet(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for(int i=0; i<n; i++){         //For First Number
            for(int j=i+1; j<n; j++){   //For Second Number
                for(int k=j+1; k<n; k++){   //For Third Number
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("The Array elements are : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = sc.nextInt();

        System.out.println("No of Triplet pairs whose sum is equal to target is :"+PairSumTriplet(arr,target));
    }
}

