package Lecture39_RECURSION_Strings;

import java.util.Scanner;

public class ReverseOfAString {

    static String reverseString(String str){
        String revStr = "";
        for(int i = 0; i < str.length(); i++){
            revStr = str.charAt(i) + revStr;
        }
        return revStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        System.out.println("Reversed String is : "+reverseString(str));

    }
}

