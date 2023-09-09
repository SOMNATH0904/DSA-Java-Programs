package Lecture20_Array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int a[] = {1,4,7,9};
        int n = a.length;
        int b[] = Arrays.copyOf(a,4);
        b[0] = 5;
        System.out.println("Original array : ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nCopied Array : ");
        for(int i=0; i<n; i++){
            System.out.print(b[i]+" ");
        }
    }
}
