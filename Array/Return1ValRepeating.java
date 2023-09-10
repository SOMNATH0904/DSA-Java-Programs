package Lecture21;

import java.util.Scanner;
public class Return1ValRepeating {      //Return the First value that is repeating
    static int repeating1stValue(int[] arr){
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    ans = arr[i];
                    break;
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
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The first value that is repeating in an array is : "+repeating1stValue(arr));
    }
}

