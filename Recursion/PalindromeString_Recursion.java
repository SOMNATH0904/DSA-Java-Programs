package Lecture39_RECURSION_Strings;

import java.util.Scanner;

public class PalindromeString_Recursion {

    static String reverseToCheckPalindrome(String str, int idx){
        if(str.length() == idx){
            return "";
        }
        String smallAns = reverseToCheckPalindrome(str, idx+1);
        return smallAns + str.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        int idx = 0;
        String revStr = reverseToCheckPalindrome(str, idx);

        if(revStr.equals(str))
            System.out.println(str+" is Palindrome");
        else
            System.out.println(str+" is not Palindrome");
    }
}
