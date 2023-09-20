package Lecture39_RECURSION_Strings;

import java.util.Scanner;

public class RemoveOccurence_Recursion {            //Time Complexity : O(n^2)

    static String removeOccurence(String str, char x, int idx) {
        //Base Case
        if(idx == str.length()){
            return "";
        }

        //Recursive Work
        String smallAns = removeOccurence(str, x, idx+1);
        char currChar = str.charAt(idx);

        //Self Work
        if(currChar != x){
            return currChar + smallAns;
        } else{
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Enter the character you want to remove from String : ");
        char x = sc.next().charAt(0);
        int idx = 0;

        System.out.println("After removing character "+x+" from the string, it looks like : "+removeOccurence(str, x, idx));

    }
}
