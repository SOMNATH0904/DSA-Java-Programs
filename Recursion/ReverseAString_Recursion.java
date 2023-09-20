package Lecture39_RECURSION_Strings;

import java.util.Scanner;

public class ReverseAString_Recursion {             //Time Complexity : O(n^2)

    static String reverseString(String str, int idx){
        if(str.length() == idx){
            return "";
        }
        String smallAns = reverseString(str, idx+1);
        return smallAns + str.charAt(idx);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        int idx = 0;

        System.out.println("Reversed String is : "+reverseString(str,idx));
    }
}
