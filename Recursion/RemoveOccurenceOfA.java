package Lecture39_RECURSION_Strings;

import java.util.Scanner;

public class RemoveOccurenceOfA {

    static void removeOccurences(String str){
        String ans = " ";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != 'a'){
                ans += str.charAt(i);
            }
        }
        System.out.println("After removing all occurences of a in the string, it looks like : "+ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        removeOccurences(str);
    }
}
