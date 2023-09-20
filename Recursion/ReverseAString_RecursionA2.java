package Lecture39_RECURSION_Strings;

import java.util.Scanner;

public class ReverseAString_RecursionA2 {

    static String reverseString(String str){
        if(str.length() == 0){
            return "";
        }
        String smallAns = reverseString(str.substring(1));
        return smallAns + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        System.out.println("Reversed String is : "+reverseString(str));
    }
}
