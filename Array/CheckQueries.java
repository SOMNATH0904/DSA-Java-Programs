package Lecture22;

// Ques : Given Q queries, check if the given number is present in the array or not.
// Note : Value of the elements in the Array is less than 10 to the power of 5,

import java.util.Scanner;
public class CheckQueries {

    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++ ;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array elements are : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] freq = makeFrequencyArray(arr);

        System.out.println("Enter no of Queries : ");
        int q = sc.nextInt();

        while(q > 0){
            System.out.println("Enter number to be searched : ");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println(x+" is Present is array : YES");
            }
            else{
                System.out.println(x+" is Present in array : NO");
            }
            q--;
        }
    }
}
