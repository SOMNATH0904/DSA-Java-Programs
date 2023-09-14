package Lecture26;

import java.util.Scanner;

public class TransposeOfMatrix {

    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int[][] arr, int r, int c){
        int[][] ans = new int[c][r];
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                ans[i][j] = arr[j][i];
            }
        }
        System.out.println("The Transpose of a matrix is : ");
        printMatrix(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of columns of a matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter Matrix elements : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is : ");
        printMatrix(arr);

        transposeMatrix(arr,r,c);

    }

}
