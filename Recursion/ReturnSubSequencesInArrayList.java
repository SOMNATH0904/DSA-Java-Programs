package Lecture40;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnSubSequencesInArrayList {

    static ArrayList<String> getSubSequences(String str){
        ArrayList<String> ans = new ArrayList<>();

        //Base Case
        if(str.length() == 0){
            ans.add("");
            return ans;
        }

        //Recursive Work
        char curr = str.charAt(0);
        ArrayList<String> smallAns = getSubSequences(str.substring(1));

        //Self Work
        for(String S : smallAns){
            ans.add(S);
            ans.add(curr + S);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        System.out.println("The Sub-Sequences of String "+str+" is : ");
        ArrayList<String> ans = getSubSequences(str);
        for(String S : ans){
            System.out.println(S);
        }
    }
}
