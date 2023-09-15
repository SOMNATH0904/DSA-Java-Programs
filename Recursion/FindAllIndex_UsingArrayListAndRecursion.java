package Lecture38;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllIndex_UsingArrayListAndRecursion {

    static ArrayList<Integer> printAllIndices(int[] arr, int target, int idx){
        //Base Case
        if(idx == arr.length){
            return new ArrayList<Integer>();    //This will return an empty ArrayList ...
        }
        ArrayList<Integer> ans = new ArrayList<>();
        //Self Work
        if(arr[idx] == target){
            ans.add(idx);
        }
        //Recursive Work
        ArrayList<Integer> smallAns = printAllIndices(arr, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elemnts of an array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value : ");
        int x = sc.nextInt();
        int idx = 0;
        System.out.println("Target is present at index : ");
        ArrayList<Integer> ans = printAllIndices(arr, x, idx);
        for (Integer i : ans) {
            System.out.print(i + " ");
        }


    }
}
