// This Code is only valid for Square Matrices ...

package Lecture26;

import java.util.Scanner;

public class TransposeInPlace_0nlyValidForSquareMatrices {

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][] matrix, int r, int c){
        for(int i = 0; i < c; i++){
            for(int j = i; j < r; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("Transpose of Matrix is : ");
        printMatrix(matrix);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of columns of a matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter Matrix elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is : ");
        printMatrix(arr);

        transposeInPlace(arr, r, c);

    }
}
