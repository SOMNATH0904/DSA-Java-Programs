package Lecture25_2DArray;

import java.util.Scanner;

public class ReverseEachRowOfMatrix {

    static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void reverseEachRow(int[][] matrix, int r){
        for(int i = 0; i < r; i++){
            reverseArray(matrix[i]);
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

        reverseEachRow(matrix,r);

    }
}
