package Lecture35;

import java.util.Scanner;

public class SeriesSumAndMinus {

    static int printSeries(int n){
        if(n == 0){
            return 0;
        }
        if(n % 2 == 0)
            return printSeries(n-1) - n;    //Even Case

        return printSeries(n-1) + n;        //Odd Case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Sum of natural numbers till Number n with alternate signs is : "+printSeries(n));
    }

}
