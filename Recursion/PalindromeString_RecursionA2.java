package Lecture39_RECURSION_Strings;

import java.util.Scanner;

public class PalindromeString_RecursionA2 {                 //Time Complexity : O(n)

    static boolean checkPalindrome(String str, int l, int r){
        if(l >= r){
            return true;
        }
        return (str.charAt(l) == str.charAt(r) && checkPalindrome(str, l+1, r-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        int left = 0;
        int right = str.length() - 1;

        System.out.println("Is "+str+" Palindrome : "+checkPalindrome(str, left, right));
    }
}
