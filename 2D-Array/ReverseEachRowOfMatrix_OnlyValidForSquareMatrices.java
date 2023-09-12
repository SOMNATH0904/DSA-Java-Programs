// This Code is only Valid for Square Matrices ...

package Lecture25_2DArray;

import java.util.Scanner;

public class ReverseEachRowOfMatrix_OnlyValidForSquareMatrices {

    static void reverseEachRow(int[][] matrix, int c){
        for(int i = 0; i < c; i++){
            int start = 0;
            int end = matrix.length - 1;
            while (start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }

        System.out.println("After reversing each row of a matrix : Matrix is as follows --> ");
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of a matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];

        System.out.println("Enter Matrix elements : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is : ");
        printMatrix(matrix);

        reverseEachRow(matrix,c);

    }
}
