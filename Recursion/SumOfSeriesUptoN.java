package Lecture35;

import java.util.Scanner;

public class SumOfSeriesUptoN {

    static int sumSeries(int n){
        if(n == 0){
            return 0;
        }
        return sumSeries(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Sum of the Series is : "+sumSeries(n));
    }

}
