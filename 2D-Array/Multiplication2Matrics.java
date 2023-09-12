package Lecture25_2DArray;

import java.util.Scanner;

public class Multiplication2Matrics {

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("Wrong Input --> Multiplication not possible ... ");
            return;
        }

        int[][] mul = new int[r1][c2];

        for(int i = 0; i < r1; i++){  // Row Number
            for(int j = 0; j < c2; j++){  // Column Number
                for(int k = 0; k < c1; k++){
                    /*
                      i = 1, j = 0
                      mul[i][j] = ith row of a * jth row of b
                    */
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 matrices is : ");
        printMatrix(mul);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns for matrix 1 : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter Matrix 1 elements : ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rows and columns for matrix 2 : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter Matrix 2 elements : ");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 is : ");
        printMatrix(a);
        System.out.println("Matrix 2 is : ");
        printMatrix(b);

        multiply(a, r1, c1, b, r2, c2);

    }
}
