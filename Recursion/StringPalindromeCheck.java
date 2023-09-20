package Lecture39_RECURSION_Strings;

import java.util.Scanner;

public class StringPalindromeCheck {

    static boolean checkPalindrome(String str){
        String revStr = "";
        for(int i = str.length()-1; i >= 0; i--){
            revStr += str.charAt(i);
        }
        if(str.equalsIgnoreCase(revStr))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        System.out.println("IS THE GIVEN STRING PALINDROME : "+checkPalindrome(str));
    }
}
