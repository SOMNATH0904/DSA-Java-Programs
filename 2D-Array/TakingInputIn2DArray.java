package Lecture25_2DArray;

import java.util.Scanner;

public class TakingInputIn2DArray {

    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter no of columns : ");
        int c = sc.nextInt();
        int[][] arr2D = new int[r][c];

        System.out.println("Enter array elements : ");
        for(int i=0; i< arr2D.length; i++){
            for(int j=0; j<arr2D[i].length; j++){
                arr2D[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D Array is as follows : ");
        printArray(arr2D);
    }
}
