package Lecture40;

import java.util.Scanner;

public class PrintSubSequences {

    static void printSubSequences(String str, String currAns){

         if(str.length() == 0){
             System.out.println(currAns);
             return;
         }

        char curr = str.charAt(0);
        String remString = str.substring(1);

        // Curr Char --> Chooses to be a part of currAns
        printSubSequences(remString, currAns + curr);

        // Curr Char --> Does not chooses to be a part of currAns
        printSubSequences(remString, currAns);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        System.out.println("The SubSequences of the String "+str+" is : ");
        printSubSequences(str, "");
    }
}
