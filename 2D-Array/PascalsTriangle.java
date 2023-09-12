package Lecture26;

import java.util.Scanner;

public class PascalsTriangle {

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for(int i = 0; i < n; i++){
            // ith row is having (i+1) columns
            ans[i] = new int[i+1];
            // First and Last element of each row is having 1
            ans[i][0] = ans[i][i] = 1;
            for(int j = 1; j < i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int n = sc.nextInt();

        int[][] ans = pascal(n);
        System.out.println("The Pascal Triangle is : ");
        printMatrix(ans);

    }
}
